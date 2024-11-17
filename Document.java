

public class Document {
	LinkedList<String> words = new LinkedList<>();
	int docID;

	Document(int id, LinkedList<String> words) {
		docID = id;
		this.words = words;

	}
}
