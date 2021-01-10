package days;

import resources.AdventDataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day11 {

    public static void main(String[] args) throws IOException {
        String inputData = AdventDataReader.readFromInputStream("Day11_01.txt");
        List<List<Character>> seatLayout = formatInputData(inputData);

        stabilizeSeatLayout(seatLayout);
    }

    private static void stabilizeSeatLayout(List<List<Character>> seatLayout) {

        printLayout(seatLayout);

//        for (int i = 0; i < 3; i++) {
        for (int rowI = 0; rowI < seatLayout.size(); rowI++) {

            List<Character> rowUp = rowI > 0 ? seatLayout.get(rowI - 1) : null;
            List<Character> row = seatLayout.get(rowI);
            List<Character> rowDown = rowI < seatLayout.size() - 1 ? seatLayout.get(rowI + 1) : null;

            for (int seatJ = 0; seatJ < row.size(); seatJ++) {

                int count = 0;

                char state = '.';
                if (row.get(seatJ) == 'L') state = 'L';
                if (row.get(seatJ) == '#') state = '#';
                if (state != '.') checkSeat(rowUp, row, rowDown, seatJ, count, state, row.size());

            }
        }
//        }
        printLayout(seatLayout);
    }

    // If a seat is empty (L) and there are no occupied seats adjacent to it, the seat becomes occupied.
    // If a seat is occupied (#) and four or more seats adjacent to it are also occupied, the seat becomes empty.
    private static void checkSeat(List<Character> rowUp, List<Character> row, List<Character> rowDown, int seatJ, int count, char state, int limit) {

        // TODO: Make it work

        // right
        if (seatJ < limit - 1 && row.get(seatJ + 1) == '#') count++;
        // left
        if (seatJ > 0 && row.get(seatJ - 1) == '#') count++;
        // up
        if (rowUp != null && rowUp.get(seatJ) == '#') count++;
        // down
        if (rowDown != null && rowDown.get(seatJ) == '#') count++;

        // up right
        if (rowUp != null && seatJ < limit - 1 && rowUp.get(seatJ + 1) == '#') count++;
        // up left
        if (rowUp != null && seatJ > 0 && rowUp.get(seatJ - 1) == '#') count++;
        // down left
        if (rowDown != null && seatJ < limit - 1 && rowDown.get(seatJ + 1) == '#') count++;
        // down right
        if (rowDown != null && seatJ > 0 && rowDown.get(seatJ - 1) == '#') count++;


        if (state == 'L' && count == 0) {
            row.set(seatJ, '#');
        }

        if (state == '#' && count >= 4) {
            row.set(seatJ, 'L');
        }

    }

    private static void printLayout(List<List<Character>> seatLayout) {

        for (List<Character> row : seatLayout) {
            for (Character seat : row) {
                System.out.print(seat);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static List<List<Character>> formatInputData(String inputData) {
        String[] seatRows = inputData.split("\n");

        List<List<Character>> seatLayout = new ArrayList<>();

        for (String seatLine : seatRows) {
            char[] seatsLineArr = seatLine.toCharArray();
            List<Character> seats = new ArrayList<>();

            for (char seat : seatsLineArr) {
                seats.add(seat);
            }
            seatLayout.add(seats);
        }

        return seatLayout;
    }
}
