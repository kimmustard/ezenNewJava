package board;

import java.util.Scanner;

public interface boardAdapter {
	
	void addBoard(Scanner scan);
	void searchBoard(Scanner scan);
	void modifyBoard(Scanner scan);
	void removeBoard(Scanner scan);
	void printBoard();
}

