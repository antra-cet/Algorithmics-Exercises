import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) throws IOException {
		// Opening the file to write the output
		File outputFile = new File("statistics.out");
		FileWriter writer = new FileWriter(outputFile);
		writer.write("Muie");

		writer.close();

		// Using an Hashmap to remember key-value pairs
		// of letters and a object that stores
		// the number of apperances that letter exists,
		// the length of the words that contain it and
		// the number of words to store at the end the maximum
		// HashMap<Character, ArrayList<Words>> letters = new HashMap<>();
		// ArrayList<Words> wordsList = new ArrayList<>();

		// // Reading the inputs
		// File inputFile = new File("statistics.in");
		// Scanner scanner = new Scanner(inputFile);

		// // Reading the first line
		// long N = scanner.nextLong();

		// for (long i = 0; i < N; i++) {
		// String word = scanner.next();
		// scanner.nextLine();
		// Words newWord = new Words(word);

		// for (int j = 0; j < word.length(); j++) {
		// newWord.incChar(word.charAt(j));
		// }

		// for (int j = 0; j < word.length(); j++) {
		// if (!letters.containsKey(word.charAt(j))) {
		// letters.put(word.charAt(j), new ArrayList<>());
		// }

		// if (!letters.get(word.charAt(j)).contains(newWord)) {
		// letters.get(word.charAt(j)).add(newWord);
		// }
		// }

		// wordsList.add(newWord);
		// }
		// scanner.close();

		// wordsList.sort(new Comparator<Words>() {
		// @Override
		// public int compare(Words o1, Words o2) {
		// return Long.compare(o1.getWord().length(), o2.getWord().length());
		// }
		// });

		// long finalMaximum = (long) -1;

		// for (Character c : letters.keySet()) {
		// ArrayList<Words> associatedWords = letters.get(c);
		// associatedWords.sort(new Comparator<Words>() {
		// @Override
		// public int compare(Words o1, Words o2) {
		// long appo1 = o1.getNumApperances().get(c);
		// long appo2 = o2.getNumApperances().get(c);

		// long noAppo1 = o1.getWord().length() - appo1;
		// long noAppo2 = o2.getWord().length() - appo2;

		// return Long.compare(noAppo1, noAppo2);
		// }
		// });

		// long totalLength = 0;
		// long apperances = 0;
		// long indexWords = 0;
		// long indexAssWords = 0;
		// long maximum = (long) 0;

		// while (indexWords < wordsList.size() && indexAssWords <
		// associatedWords.size()
		// && ((apperances > totalLength / 2) || apperances == 0)) {

		// Words word1 = wordsList.get((int) indexWords);
		// Words word2 = associatedWords.get((int) indexAssWords);

		// long addWord1 = apperances + word1.getNumApperances().get(c);
		// long addWord2 = apperances + word2.getNumApperances().get(c);

		// if (addWord1 > (totalLength + word1.getWord().length()) / 2) {
		// if (addWord2 > (totalLength + word2.getWord().length()) / 2) {
		// if (addWord1 > addWord2) {
		// indexWords++;
		// apperances += word1.getNumApperances().get(c);
		// totalLength += word1.getWord().length();
		// maximum++;
		// } else {
		// indexAssWords++;
		// apperances += word2.getNumApperances().get(c);
		// totalLength += word2.getWord().length();
		// maximum++;
		// }
		// } else {
		// indexWords++;
		// totalLength += word1.getWord().length();
		// apperances += word1.getNumApperances().get(c);
		// maximum++;
		// }
		// } else {
		// if (addWord2 > (totalLength + word2.getWord().length()) / 2) {
		// indexAssWords++;
		// apperances += word2.getNumApperances().get(c);
		// totalLength += word2.getWord().length();
		// maximum++;
		// } else {
		// break;
		// }
		// }
		// }

		// while (indexWords < wordsList.size() && (apperances > totalLength / 2)) {
		// Words word = wordsList.get((int) indexWords);
		// if ((apperances + word.getNumApperances().get(c)) > (totalLength +
		// word.getWord().length()) / 2) {
		// apperances += word.getNumApperances().get(c);
		// totalLength += word.getWord().length();
		// maximum++;
		// indexWords++;
		// } else {
		// break;
		// }
		// }

		// while (indexAssWords < associatedWords.size() && (apperances > totalLength /
		// 2)) {
		// Words word = associatedWords.get((int) indexWords);
		// if ((apperances + word.getNumApperances().get(c)) > (totalLength +
		// word.getWord().length()) / 2) {
		// apperances += word.getNumApperances().get(c);
		// totalLength += word.getWord().length();
		// maximum++;
		// indexAssWords++;
		// } else {
		// break;
		// }
		// }

		// if (maximum != 0 && maximum > finalMaximum) {
		// finalMaximum = maximum;
		// }
		// }
	}
}

class Words {
	private String word;
	private HashMap<Character, Long> numApperances = new HashMap<>();

	public Words(String word) {
		this.word = word;
	}

	public void incChar(Character c) {
		if (!numApperances.containsKey(c)) {
			numApperances.put(c, (long) 0);
		}

		long value = numApperances.get(c);
		numApperances.put(c, value + 1);
	}

	public String getWord() {
		return word;
	}

	public HashMap<Character, Long> getNumApperances() {
		return numApperances;
	}

	@Override
	public String toString() {
		return "[" + word + ", "
				+ numApperances.toString() + "]";
	}
}