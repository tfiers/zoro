// Generated by `scripts/generate_android_domain_model.py` on 2019-12-07 00:09:05
// using Zotero domain model downloaded on 2019-12-07 00:08:57.

@file:Suppress("unused", "UNUSED_PARAMETER")

package net.tomasfiers.zoro.data.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.threeten.bp.OffsetDateTime

@Entity
data class Item(
    @PrimaryKey
    override val id: String,
    override var version: Long,
    override var name: String,
    var type: ItemType,
    var dateAdded: OffsetDateTime,
    var dateModified: OffsetDateTime,
    var abstractNote: String?,
    var accessDate: String?,
    var applicationNumber: String?,
    var archive: String?,
    var archiveLocation: String?,
    var artworkMedium: String?,
    var artworkSize: String?,
    var assignee: String?,
    var audioFileType: String?,
    var audioRecordingFormat: String?,
    var billNumber: String?,
    var blogTitle: String?,
    var bookTitle: String?,
    var callNumber: String?,
    var caseName: String?,
    var code: String?,
    var codeNumber: String?,
    var codePages: String?,
    var codeVolume: String?,
    var committee: String?,
    var company: String?,
    var conferenceName: String?,
    var country: String?,
    var court: String?,
    var date: String?,
    var dateDecided: String?,
    var dateEnacted: String?,
    var dictionaryTitle: String?,
    var distributor: String?,
    var docketNumber: String?,
    var documentNumber: String?,
    var DOI: String?,
    var edition: String?,
    var encyclopediaTitle: String?,
    var episodeNumber: String?,
    var extra: String?,
    var filingDate: String?,
    var firstPage: String?,
    var forumTitle: String?,
    var genre: String?,
    var history: String?,
    var institution: String?,
    var interviewMedium: String?,
    var ISBN: String?,
    var ISSN: String?,
    var issue: String?,
    var issueDate: String?,
    var issuingAuthority: String?,
    var itemType: String?,
    var journalAbbreviation: String?,
    var label: String?,
    var language: String?,
    var legalStatus: String?,
    var legislativeBody: String?,
    var letterType: String?,
    var libraryCatalog: String?,
    var manuscriptType: String?,
    var mapType: String?,
    var meetingName: String?,
    var nameOfAct: String?,
    var network: String?,
    var note: String?,
    var numberOfVolumes: String?,
    var numPages: String?,
    var pages: String?,
    var patentNumber: String?,
    var place: String?,
    var postType: String?,
    var presentationType: String?,
    var priorityNumbers: String?,
    var proceedingsTitle: String?,
    var programmingLanguage: String?,
    var programTitle: String?,
    var publicationTitle: String?,
    var publicLawNumber: String?,
    var publisher: String?,
    var references: String?,
    var reporter: String?,
    var reporterVolume: String?,
    var reportNumber: String?,
    var reportType: String?,
    var rights: String?,
    var runningTime: String?,
    var scale: String?,
    var section: String?,
    var series: String?,
    var seriesNumber: String?,
    var seriesText: String?,
    var seriesTitle: String?,
    var session: String?,
    var shortTitle: String?,
    var studio: String?,
    var subject: String?,
    var system: String?,
    var thesisType: String?,
    var title: String?,
    var university: String?,
    var url: String?,
    var versionNumber: String?,
    var videoRecordingFormat: String?,
    var volume: String?,
    var websiteTitle: String?,
    var websiteType: String?
) : TreeItem

@Entity
data class Creator(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var firstName: String?,
    var lastName: String?,
    var name: String?
)

enum class ItemType(camelCaseName: String, friendlyName: String) {
    ARTWORK("artwork", "Artwork"),
    ATTACHMENT("attachment", "Attachment"),
    AUDIO_RECORDING("audioRecording", "Audio Recording"),
    BILL("bill", "Bill"),
    BLOG_POST("blogPost", "Blog Post"),
    BOOK("book", "Book"),
    BOOK_SECTION("bookSection", "Book Section"),
    CASE("case", "Case"),
    COMPUTER_PROGRAM("computerProgram", "Computer Program"),
    CONFERENCE_PAPER("conferencePaper", "Conference Paper"),
    DICTIONARY_ENTRY("dictionaryEntry", "Dictionary Entry"),
    DOCUMENT("document", "Document"),
    EMAIL("email", "E-mail"),
    ENCYCLOPEDIA_ARTICLE("encyclopediaArticle", "Encyclopedia Article"),
    FILM("film", "Film"),
    FORUM_POST("forumPost", "Forum Post"),
    HEARING("hearing", "Hearing"),
    INSTANT_MESSAGE("instantMessage", "Instant Message"),
    INTERVIEW("interview", "Interview"),
    JOURNAL_ARTICLE("journalArticle", "Journal Article"),
    LETTER("letter", "Letter"),
    MAGAZINE_ARTICLE("magazineArticle", "Magazine Article"),
    MANUSCRIPT("manuscript", "Manuscript"),
    MAP("map", "Map"),
    NEWSPAPER_ARTICLE("newspaperArticle", "Newspaper Article"),
    NOTE("note", "Note"),
    PATENT("patent", "Patent"),
    PODCAST("podcast", "Podcast"),
    PRESENTATION("presentation", "Presentation"),
    RADIO_BROADCAST("radioBroadcast", "Radio Broadcast"),
    REPORT("report", "Report"),
    STATUTE("statute", "Statute"),
    THESIS("thesis", "Thesis"),
    TV_BROADCAST("tvBroadcast", "TV Broadcast"),
    VIDEO_RECORDING("videoRecording", "Video Recording"),
    WEBPAGE("webpage", "Web Page")
}

enum class Field(camelCaseName: String, friendlyName: String) {
    ABSTRACT_NOTE("abstractNote", "Abstract"),
    ACCESS_DATE("accessDate", "Accessed"),
    APPLICATION_NUMBER("applicationNumber", "Application Number"),
    ARCHIVE("archive", "Archive"),
    ARCHIVE_LOCATION("archiveLocation", "Loc. in Archive"),
    ARTWORK_MEDIUM("artworkMedium", "Medium"),
    ARTWORK_SIZE("artworkSize", "Artwork Size"),
    ASSIGNEE("assignee", "Assignee"),
    AUDIO_FILE_TYPE("audioFileType", "File Type"),
    AUDIO_RECORDING_FORMAT("audioRecordingFormat", "Format"),
    BILL_NUMBER("billNumber", "Bill Number"),
    BLOG_TITLE("blogTitle", "Blog Title"),
    BOOK_TITLE("bookTitle", "Book Title"),
    CALL_NUMBER("callNumber", "Call Number"),
    CASE_NAME("caseName", "Case Name"),
    CODE("code", "Code"),
    CODE_NUMBER("codeNumber", "Code Number"),
    CODE_PAGES("codePages", "Code Pages"),
    CODE_VOLUME("codeVolume", "Code Volume"),
    COMMITTEE("committee", "Committee"),
    COMPANY("company", "Company"),
    CONFERENCE_NAME("conferenceName", "Conference Name"),
    COUNTRY("country", "Country"),
    COURT("court", "Court"),
    DATE("date", "Date"),
    DATE_ADDED("dateAdded", "Date Added"),
    DATE_DECIDED("dateDecided", "Date Decided"),
    DATE_ENACTED("dateEnacted", "Date Enacted"),
    DATE_MODIFIED("dateModified", "Modified"),
    DICTIONARY_TITLE("dictionaryTitle", "Dictionary Title"),
    DISTRIBUTOR("distributor", "Distributor"),
    DOCKET_NUMBER("docketNumber", "Docket Number"),
    DOCUMENT_NUMBER("documentNumber", "Document Number"),
    DOI("DOI", "DOI"),
    EDITION("edition", "Edition"),
    ENCYCLOPEDIA_TITLE("encyclopediaTitle", "Encyclopedia Title"),
    EPISODE_NUMBER("episodeNumber", "Episode Number"),
    EXTRA("extra", "Extra"),
    FILING_DATE("filingDate", "Filing Date"),
    FIRST_PAGE("firstPage", "First Page"),
    FORUM_TITLE("forumTitle", "Forum/Listserv Title"),
    GENRE("genre", "Genre"),
    HISTORY("history", "History"),
    INSTITUTION("institution", "Institution"),
    INTERVIEW_MEDIUM("interviewMedium", "Medium"),
    ISBN("ISBN", "ISBN"),
    ISSN("ISSN", "ISSN"),
    ISSUE("issue", "Issue"),
    ISSUE_DATE("issueDate", "Issue Date"),
    ISSUING_AUTHORITY("issuingAuthority", "Issuing Authority"),
    ITEM_TYPE("itemType", "Item Type"),
    JOURNAL_ABBREVIATION("journalAbbreviation", "Journal Abbr"),
    LABEL("label", "Label"),
    LANGUAGE("language", "Language"),
    LEGAL_STATUS("legalStatus", "Legal Status"),
    LEGISLATIVE_BODY("legislativeBody", "Legislative Body"),
    LETTER_TYPE("letterType", "Type"),
    LIBRARY_CATALOG("libraryCatalog", "Library Catalog"),
    MANUSCRIPT_TYPE("manuscriptType", "Type"),
    MAP_TYPE("mapType", "Type"),
    MEETING_NAME("meetingName", "Meeting Name"),
    NAME_OF_ACT("nameOfAct", "Name of Act"),
    NETWORK("network", "Network"),
    NUMBER_OF_VOLUMES("numberOfVolumes", "# of Volumes"),
    NUM_PAGES("numPages", "# of Pages"),
    PAGES("pages", "Pages"),
    PATENT_NUMBER("patentNumber", "Patent Number"),
    PLACE("place", "Place"),
    POST_TYPE("postType", "Post Type"),
    PRESENTATION_TYPE("presentationType", "Type"),
    PRIORITY_NUMBERS("priorityNumbers", "Priority Numbers"),
    PROCEEDINGS_TITLE("proceedingsTitle", "Proceedings Title"),
    PROGRAMMING_LANGUAGE("programmingLanguage", "Language"),
    PROGRAM_TITLE("programTitle", "Program Title"),
    PUBLICATION_TITLE("publicationTitle", "Publication"),
    PUBLIC_LAW_NUMBER("publicLawNumber", "Public Law Number"),
    PUBLISHER("publisher", "Publisher"),
    REFERENCES("references", "References"),
    REPORTER("reporter", "Reporter"),
    REPORTER_VOLUME("reporterVolume", "Reporter Volume"),
    REPORT_NUMBER("reportNumber", "Report Number"),
    REPORT_TYPE("reportType", "Report Type"),
    RIGHTS("rights", "Rights"),
    RUNNING_TIME("runningTime", "Running Time"),
    SCALE("scale", "Scale"),
    SECTION("section", "Section"),
    SERIES("series", "Series"),
    SERIES_NUMBER("seriesNumber", "Series Number"),
    SERIES_TEXT("seriesText", "Series Text"),
    SERIES_TITLE("seriesTitle", "Series Title"),
    SESSION("session", "Session"),
    SHORT_TITLE("shortTitle", "Short Title"),
    STUDIO("studio", "Studio"),
    SUBJECT("subject", "Subject"),
    SYSTEM("system", "System"),
    THESIS_TYPE("thesisType", "Type"),
    TITLE("title", "Title"),
    UNIVERSITY("university", "University"),
    URL("url", "URL"),
    VERSION_NUMBER("versionNumber", "Version"),
    VIDEO_RECORDING_FORMAT("videoRecordingFormat", "Format"),
    VOLUME("volume", "Volume"),
    WEBSITE_TITLE("websiteTitle", "Website Title"),
    WEBSITE_TYPE("websiteType", "Website Type")
}

enum class CreatorType(camelCaseName: String, friendlyName: String, itemType: ItemType) {
    ARTWORK__ARTIST("artist", "Artist", ItemType.ARTWORK),
    ARTWORK__CONTRIBUTOR("contributor", "Contributor", ItemType.ARTWORK),
    AUDIO_RECORDING__COMPOSER("composer", "Composer", ItemType.AUDIO_RECORDING),
    AUDIO_RECORDING__CONTRIBUTOR("contributor", "Contributor", ItemType.AUDIO_RECORDING),
    AUDIO_RECORDING__PERFORMER("performer", "Performer", ItemType.AUDIO_RECORDING),
    AUDIO_RECORDING__WORDS_BY("wordsBy", "Words By", ItemType.AUDIO_RECORDING),
    BILL__CONTRIBUTOR("contributor", "Contributor", ItemType.BILL),
    BILL__COSPONSOR("cosponsor", "Cosponsor", ItemType.BILL),
    BILL__SPONSOR("sponsor", "Sponsor", ItemType.BILL),
    BLOG_POST__AUTHOR("author", "Author", ItemType.BLOG_POST),
    BLOG_POST__COMMENTER("commenter", "Commenter", ItemType.BLOG_POST),
    BLOG_POST__CONTRIBUTOR("contributor", "Contributor", ItemType.BLOG_POST),
    BOOK_SECTION__AUTHOR("author", "Author", ItemType.BOOK_SECTION),
    BOOK_SECTION__BOOK_AUTHOR("bookAuthor", "Book Author", ItemType.BOOK_SECTION),
    BOOK_SECTION__CONTRIBUTOR("contributor", "Contributor", ItemType.BOOK_SECTION),
    BOOK_SECTION__EDITOR("editor", "Editor", ItemType.BOOK_SECTION),
    BOOK_SECTION__SERIES_EDITOR("seriesEditor", "Series Editor", ItemType.BOOK_SECTION),
    BOOK_SECTION__TRANSLATOR("translator", "Translator", ItemType.BOOK_SECTION),
    BOOK__AUTHOR("author", "Author", ItemType.BOOK),
    BOOK__CONTRIBUTOR("contributor", "Contributor", ItemType.BOOK),
    BOOK__EDITOR("editor", "Editor", ItemType.BOOK),
    BOOK__SERIES_EDITOR("seriesEditor", "Series Editor", ItemType.BOOK),
    BOOK__TRANSLATOR("translator", "Translator", ItemType.BOOK),
    CASE__AUTHOR("author", "Author", ItemType.CASE),
    CASE__CONTRIBUTOR("contributor", "Contributor", ItemType.CASE),
    CASE__COUNSEL("counsel", "Counsel", ItemType.CASE),
    COMPUTER_PROGRAM__CONTRIBUTOR("contributor", "Contributor", ItemType.COMPUTER_PROGRAM),
    COMPUTER_PROGRAM__PROGRAMMER("programmer", "Programmer", ItemType.COMPUTER_PROGRAM),
    CONFERENCE_PAPER__AUTHOR("author", "Author", ItemType.CONFERENCE_PAPER),
    CONFERENCE_PAPER__CONTRIBUTOR("contributor", "Contributor", ItemType.CONFERENCE_PAPER),
    CONFERENCE_PAPER__EDITOR("editor", "Editor", ItemType.CONFERENCE_PAPER),
    CONFERENCE_PAPER__SERIES_EDITOR("seriesEditor", "Series Editor", ItemType.CONFERENCE_PAPER),
    CONFERENCE_PAPER__TRANSLATOR("translator", "Translator", ItemType.CONFERENCE_PAPER),
    DICTIONARY_ENTRY__AUTHOR("author", "Author", ItemType.DICTIONARY_ENTRY),
    DICTIONARY_ENTRY__CONTRIBUTOR("contributor", "Contributor", ItemType.DICTIONARY_ENTRY),
    DICTIONARY_ENTRY__EDITOR("editor", "Editor", ItemType.DICTIONARY_ENTRY),
    DICTIONARY_ENTRY__SERIES_EDITOR("seriesEditor", "Series Editor", ItemType.DICTIONARY_ENTRY),
    DICTIONARY_ENTRY__TRANSLATOR("translator", "Translator", ItemType.DICTIONARY_ENTRY),
    DOCUMENT__AUTHOR("author", "Author", ItemType.DOCUMENT),
    DOCUMENT__CONTRIBUTOR("contributor", "Contributor", ItemType.DOCUMENT),
    DOCUMENT__EDITOR("editor", "Editor", ItemType.DOCUMENT),
    DOCUMENT__REVIEWED_AUTHOR("reviewedAuthor", "Reviewed Author", ItemType.DOCUMENT),
    DOCUMENT__TRANSLATOR("translator", "Translator", ItemType.DOCUMENT),
    EMAIL__AUTHOR("author", "Author", ItemType.EMAIL),
    EMAIL__CONTRIBUTOR("contributor", "Contributor", ItemType.EMAIL),
    EMAIL__RECIPIENT("recipient", "Recipient", ItemType.EMAIL),
    ENCYCLOPEDIA_ARTICLE__AUTHOR("author", "Author", ItemType.ENCYCLOPEDIA_ARTICLE),
    ENCYCLOPEDIA_ARTICLE__CONTRIBUTOR("contributor", "Contributor", ItemType.ENCYCLOPEDIA_ARTICLE),
    ENCYCLOPEDIA_ARTICLE__EDITOR("editor", "Editor", ItemType.ENCYCLOPEDIA_ARTICLE),
    ENCYCLOPEDIA_ARTICLE__SERIES_EDITOR("seriesEditor", "Series Editor", ItemType.ENCYCLOPEDIA_ARTICLE),
    ENCYCLOPEDIA_ARTICLE__TRANSLATOR("translator", "Translator", ItemType.ENCYCLOPEDIA_ARTICLE),
    FILM__CONTRIBUTOR("contributor", "Contributor", ItemType.FILM),
    FILM__DIRECTOR("director", "Director", ItemType.FILM),
    FILM__PRODUCER("producer", "Producer", ItemType.FILM),
    FILM__SCRIPTWRITER("scriptwriter", "Scriptwriter", ItemType.FILM),
    FORUM_POST__AUTHOR("author", "Author", ItemType.FORUM_POST),
    FORUM_POST__CONTRIBUTOR("contributor", "Contributor", ItemType.FORUM_POST),
    HEARING__CONTRIBUTOR("contributor", "Contributor", ItemType.HEARING),
    INSTANT_MESSAGE__AUTHOR("author", "Author", ItemType.INSTANT_MESSAGE),
    INSTANT_MESSAGE__CONTRIBUTOR("contributor", "Contributor", ItemType.INSTANT_MESSAGE),
    INSTANT_MESSAGE__RECIPIENT("recipient", "Recipient", ItemType.INSTANT_MESSAGE),
    INTERVIEW__CONTRIBUTOR("contributor", "Contributor", ItemType.INTERVIEW),
    INTERVIEW__INTERVIEWEE("interviewee", "Interview With", ItemType.INTERVIEW),
    INTERVIEW__INTERVIEWER("interviewer", "Interviewer", ItemType.INTERVIEW),
    INTERVIEW__TRANSLATOR("translator", "Translator", ItemType.INTERVIEW),
    JOURNAL_ARTICLE__AUTHOR("author", "Author", ItemType.JOURNAL_ARTICLE),
    JOURNAL_ARTICLE__CONTRIBUTOR("contributor", "Contributor", ItemType.JOURNAL_ARTICLE),
    JOURNAL_ARTICLE__EDITOR("editor", "Editor", ItemType.JOURNAL_ARTICLE),
    JOURNAL_ARTICLE__REVIEWED_AUTHOR("reviewedAuthor", "Reviewed Author", ItemType.JOURNAL_ARTICLE),
    JOURNAL_ARTICLE__TRANSLATOR("translator", "Translator", ItemType.JOURNAL_ARTICLE),
    LETTER__AUTHOR("author", "Author", ItemType.LETTER),
    LETTER__CONTRIBUTOR("contributor", "Contributor", ItemType.LETTER),
    LETTER__RECIPIENT("recipient", "Recipient", ItemType.LETTER),
    MAGAZINE_ARTICLE__AUTHOR("author", "Author", ItemType.MAGAZINE_ARTICLE),
    MAGAZINE_ARTICLE__CONTRIBUTOR("contributor", "Contributor", ItemType.MAGAZINE_ARTICLE),
    MAGAZINE_ARTICLE__REVIEWED_AUTHOR("reviewedAuthor", "Reviewed Author", ItemType.MAGAZINE_ARTICLE),
    MAGAZINE_ARTICLE__TRANSLATOR("translator", "Translator", ItemType.MAGAZINE_ARTICLE),
    MANUSCRIPT__AUTHOR("author", "Author", ItemType.MANUSCRIPT),
    MANUSCRIPT__CONTRIBUTOR("contributor", "Contributor", ItemType.MANUSCRIPT),
    MANUSCRIPT__TRANSLATOR("translator", "Translator", ItemType.MANUSCRIPT),
    MAP__CARTOGRAPHER("cartographer", "Cartographer", ItemType.MAP),
    MAP__CONTRIBUTOR("contributor", "Contributor", ItemType.MAP),
    MAP__SERIES_EDITOR("seriesEditor", "Series Editor", ItemType.MAP),
    NEWSPAPER_ARTICLE__AUTHOR("author", "Author", ItemType.NEWSPAPER_ARTICLE),
    NEWSPAPER_ARTICLE__CONTRIBUTOR("contributor", "Contributor", ItemType.NEWSPAPER_ARTICLE),
    NEWSPAPER_ARTICLE__REVIEWED_AUTHOR("reviewedAuthor", "Reviewed Author", ItemType.NEWSPAPER_ARTICLE),
    NEWSPAPER_ARTICLE__TRANSLATOR("translator", "Translator", ItemType.NEWSPAPER_ARTICLE),
    PATENT__ATTORNEY_AGENT("attorneyAgent", "Attorney/Agent", ItemType.PATENT),
    PATENT__CONTRIBUTOR("contributor", "Contributor", ItemType.PATENT),
    PATENT__INVENTOR("inventor", "Inventor", ItemType.PATENT),
    PODCAST__CONTRIBUTOR("contributor", "Contributor", ItemType.PODCAST),
    PODCAST__GUEST("guest", "Guest", ItemType.PODCAST),
    PODCAST__PODCASTER("podcaster", "Podcaster", ItemType.PODCAST),
    PRESENTATION__CONTRIBUTOR("contributor", "Contributor", ItemType.PRESENTATION),
    PRESENTATION__PRESENTER("presenter", "Presenter", ItemType.PRESENTATION),
    RADIO_BROADCAST__CAST_MEMBER("castMember", "Cast Member", ItemType.RADIO_BROADCAST),
    RADIO_BROADCAST__CONTRIBUTOR("contributor", "Contributor", ItemType.RADIO_BROADCAST),
    RADIO_BROADCAST__DIRECTOR("director", "Director", ItemType.RADIO_BROADCAST),
    RADIO_BROADCAST__GUEST("guest", "Guest", ItemType.RADIO_BROADCAST),
    RADIO_BROADCAST__PRODUCER("producer", "Producer", ItemType.RADIO_BROADCAST),
    RADIO_BROADCAST__SCRIPTWRITER("scriptwriter", "Scriptwriter", ItemType.RADIO_BROADCAST),
    REPORT__AUTHOR("author", "Author", ItemType.REPORT),
    REPORT__CONTRIBUTOR("contributor", "Contributor", ItemType.REPORT),
    REPORT__SERIES_EDITOR("seriesEditor", "Series Editor", ItemType.REPORT),
    REPORT__TRANSLATOR("translator", "Translator", ItemType.REPORT),
    STATUTE__AUTHOR("author", "Author", ItemType.STATUTE),
    STATUTE__CONTRIBUTOR("contributor", "Contributor", ItemType.STATUTE),
    THESIS__AUTHOR("author", "Author", ItemType.THESIS),
    THESIS__CONTRIBUTOR("contributor", "Contributor", ItemType.THESIS),
    TV_BROADCAST__CAST_MEMBER("castMember", "Cast Member", ItemType.TV_BROADCAST),
    TV_BROADCAST__CONTRIBUTOR("contributor", "Contributor", ItemType.TV_BROADCAST),
    TV_BROADCAST__DIRECTOR("director", "Director", ItemType.TV_BROADCAST),
    TV_BROADCAST__GUEST("guest", "Guest", ItemType.TV_BROADCAST),
    TV_BROADCAST__PRODUCER("producer", "Producer", ItemType.TV_BROADCAST),
    TV_BROADCAST__SCRIPTWRITER("scriptwriter", "Scriptwriter", ItemType.TV_BROADCAST),
    VIDEO_RECORDING__CAST_MEMBER("castMember", "Cast Member", ItemType.VIDEO_RECORDING),
    VIDEO_RECORDING__CONTRIBUTOR("contributor", "Contributor", ItemType.VIDEO_RECORDING),
    VIDEO_RECORDING__DIRECTOR("director", "Director", ItemType.VIDEO_RECORDING),
    VIDEO_RECORDING__PRODUCER("producer", "Producer", ItemType.VIDEO_RECORDING),
    VIDEO_RECORDING__SCRIPTWRITER("scriptwriter", "Scriptwriter", ItemType.VIDEO_RECORDING),
    WEBPAGE__AUTHOR("author", "Author", ItemType.WEBPAGE),
    WEBPAGE__CONTRIBUTOR("contributor", "Contributor", ItemType.WEBPAGE),
    WEBPAGE__TRANSLATOR("translator", "Translator", ItemType.WEBPAGE)
}
