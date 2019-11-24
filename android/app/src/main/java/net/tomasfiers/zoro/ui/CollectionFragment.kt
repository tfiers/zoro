package net.tomasfiers.zoro.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import net.tomasfiers.zoro.databinding.CollectionFragmentBinding
import timber.log.Timber

class CollectionFragment : Fragment() {

    private val args: CollectionFragmentArgs by navArgs()
    private val viewModel: CollectionViewModel by viewModels {
        CollectionViewModelFactory(args.collectionId)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = CollectionFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.vm = viewModel

        val adapter = RecyclerViewAdapter(TreeItemClickListener { treeItem ->
            findNavController().navigate(
                CollectionFragmentDirections.actionCollectionSelf(treeItem.id)
            )
        })
        binding.recyclerView.adapter = adapter
        viewModel.displayedCollections.observe(viewLifecycleOwner, Observer {
            Timber.i(it.toString())
            adapter.submitList(it)
        })
        // Performance improvement (because changes in list content do not change layout size):
        binding.recyclerView.setHasFixedSize(true)

        return binding.root
    }
}
