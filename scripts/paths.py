from pathlib import Path

data_dir = Path("data")
item_types_file = data_dir / "item_types.json"
fields_file = data_dir / "fields.json"
item_type_fields_file = data_dir / "item_type_fields.json"
creator_types_file = data_dir / "creator_types.json"
creator_fields_file = data_dir / "creator_fields.json"
timestamp_file = data_dir / "download_timestamp.txt"

android_src_dir = Path("../android/app/src/main/java/net/tomasfiers/zoro")
android_domain_file = android_src_dir / "data" / "domain" / "Item.kt"
