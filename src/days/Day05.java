package days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day05 {

    public static void main(String[] args) {

        String seatBatch = "FFBBBBBLLR\n" +
                "BFBFBBBRLL\n" +
                "FBFFFFBLRL\n" +
                "BFFBFBBRLR\n" +
                "FFBBFFFRRL\n" +
                "FBFBFFBLLR\n" +
                "BFFBFBFLLR\n" +
                "BFFBBBBRRL\n" +
                "FBBBFBFLRL\n" +
                "BFFBFBBRLL\n" +
                "FFBBFBBRRR\n" +
                "BBFBBBBLRL\n" +
                "FFBFBBFLRL\n" +
                "BBFFFBBLLR\n" +
                "FFBBBFFRLL\n" +
                "FBFBFFBLRL\n" +
                "BFFFBFBLRL\n" +
                "FFBFBFFRRL\n" +
                "BBBFFFBRRR\n" +
                "BBFFBBFLLL\n" +
                "BFBBBFBLRR\n" +
                "FBFBFFBRRL\n" +
                "FFFBBFBLLR\n" +
                "FBBFBFFRLR\n" +
                "FBFFFFBRRL\n" +
                "BBFFFFFLLR\n" +
                "BFBFFBBLLR\n" +
                "FFBFBBBRRR\n" +
                "FFBBBBBRLR\n" +
                "BBFFBFFRLR\n" +
                "BBFBBBBRRL\n" +
                "FFBFFFFLLL\n" +
                "BBBFFBFRRL\n" +
                "FFBFFFFLRR\n" +
                "FBBBBBFLLR\n" +
                "BFBFBBBLRL\n" +
                "BFBBBFFRRL\n" +
                "FBFFBBFRRR\n" +
                "BBFFFFBRLR\n" +
                "FFBFBBFRLL\n" +
                "FFBFBFBLLL\n" +
                "FBBBFBFRRR\n" +
                "FFFBBBFRLL\n" +
                "BFFFBBBLLR\n" +
                "FBFFBFBRLR\n" +
                "FFBFBBBLLL\n" +
                "BFBBBFFLLL\n" +
                "BFFBFBFLRR\n" +
                "BFFBFBBRRR\n" +
                "BFBBBFBLLL\n" +
                "FBFFBFFLRL\n" +
                "BBFFFBBRRL\n" +
                "FFFBFBBRLR\n" +
                "BBFBBBFLLR\n" +
                "FFBBBBBLRR\n" +
                "BFFFFBFRRL\n" +
                "BFFFBBBRLR\n" +
                "BFBBBBBLLR\n" +
                "FBFBBFFRRL\n" +
                "BFFBFFBLLR\n" +
                "FFBBFFFRLR\n" +
                "FBBFFFBLLL\n" +
                "FFFBBFFLRR\n" +
                "BBFFFFBRLL\n" +
                "BFFFFFFRLR\n" +
                "BFFBBBFLLR\n" +
                "BFBBBFBRRL\n" +
                "FBFBBFFRRR\n" +
                "BFBFBFFLRR\n" +
                "BBFBFFFLLL\n" +
                "BBBFFBFLLL\n" +
                "FFBBFBFRRL\n" +
                "FBBFFFBLRL\n" +
                "BFBBBBFLLR\n" +
                "BFBFBBBLRR\n" +
                "BFBBBBBRLR\n" +
                "BFFFBFFRRL\n" +
                "BFFFBFFLLL\n" +
                "BFBBBBBRLL\n" +
                "BBFFBFBRLL\n" +
                "FBBBBBFRLR\n" +
                "BBFFBFFLLR\n" +
                "FBBFFFFRLR\n" +
                "FBFFFBFLRL\n" +
                "BBFBFBBRLR\n" +
                "BFFBBFBRRL\n" +
                "FBFFFFFRRR\n" +
                "BFBFBBFLLL\n" +
                "FBBFBBFRLR\n" +
                "BFBBFBBRRR\n" +
                "FFFBBBFLRL\n" +
                "BFFBFFBRRL\n" +
                "FBFBFBBLLR\n" +
                "BBFBFFFLRL\n" +
                "FFFBFBBRRR\n" +
                "BBFFBBFRRL\n" +
                "BFBFBFBLRR\n" +
                "BFFBBBBRLR\n" +
                "FBBFFFFLLR\n" +
                "FBBBFFBLLR\n" +
                "FBBBBFFLRL\n" +
                "FBBBBFFLLL\n" +
                "BBFFBBFRLR\n" +
                "FFBBFBFLRL\n" +
                "BFBFFBBRLL\n" +
                "FBFBBFFLRR\n" +
                "BFFFFFBRLL\n" +
                "BBFBFBBRRL\n" +
                "FBBBBBBLLR\n" +
                "BBFBFBFLLL\n" +
                "BFFFFBBRLL\n" +
                "BFBFFBFRRL\n" +
                "FFBFFBFLLL\n" +
                "BFFFBFBLLR\n" +
                "FBBFBFFRRR\n" +
                "FBBFFBFRLR\n" +
                "FBBFBFBRRR\n" +
                "FBFBBFBRLR\n" +
                "FFFBBFBRRL\n" +
                "FBBBBFBLRR\n" +
                "FBBFBBFLRR\n" +
                "BBBFFBFRRR\n" +
                "BFFBBBBLLL\n" +
                "FBFBFBFLRL\n" +
                "FFBFFBFLRL\n" +
                "FFFBBFBLLL\n" +
                "FBBFFBFLLR\n" +
                "FBBBFBBRRR\n" +
                "FBBBBFBRLR\n" +
                "FBBFFFFRRR\n" +
                "FFFBFBFLLR\n" +
                "FFBFFFFRRR\n" +
                "BFBBBBFRLR\n" +
                "BFFBFBFRRR\n" +
                "BBFBBFFRLL\n" +
                "BFFBFFFLLR\n" +
                "FBBBFBBRLL\n" +
                "BBFBFFFRRR\n" +
                "FFBFBBBRRL\n" +
                "FBBBFBFLLL\n" +
                "FBBBFBBLRR\n" +
                "BFBFBBFRLL\n" +
                "BFBFBFBRLL\n" +
                "FBFFBBBLRL\n" +
                "FBBBBFFRRL\n" +
                "BBFFBFBRLR\n" +
                "BBFFBFFRRR\n" +
                "FFFBFBFLRR\n" +
                "FFFBFBBLLR\n" +
                "FBBBFFFRLL\n" +
                "FBFBBBFLLL\n" +
                "FBFBBFFRLL\n" +
                "BFBBFFBLLR\n" +
                "FFBFFFFRLR\n" +
                "BFFFBBFRRL\n" +
                "BFBBFBFLLL\n" +
                "FBFFFBFLLR\n" +
                "BBBFFBFRLR\n" +
                "BFFBBFFLLL\n" +
                "FFBBBBBRRL\n" +
                "BBFFBFBLLL\n" +
                "BFFFBFFLLR\n" +
                "BBBFFBFLRL\n" +
                "BFBFFBFLLL\n" +
                "FBFFBFFRLR\n" +
                "FFBFBBBLRL\n" +
                "FBBFBFBLLR\n" +
                "FBBFBBFLRL\n" +
                "FFBBFFBLRL\n" +
                "FFBBBBFRLR\n" +
                "FFBFFFFRLL\n" +
                "FFBBBFBRLL\n" +
                "BFFFBBFLRL\n" +
                "FFFBBBFRRL\n" +
                "BFBFBFFLLR\n" +
                "FFFBFBFRLR\n" +
                "BBFBFBFRLR\n" +
                "FBBBFFBRRL\n" +
                "FFBBBBFLLL\n" +
                "FFBBFFBRLL\n" +
                "FBBFFFBRRR\n" +
                "FFFBBBBRLL\n" +
                "FBFFFBFRRR\n" +
                "BFBBBFFLLR\n" +
                "BBFBBFBLRR\n" +
                "FFBFBBBLLR\n" +
                "BFBFBBBRRR\n" +
                "BBFFFBBLRR\n" +
                "FBFBFFBLRR\n" +
                "FFFBFBBLLL\n" +
                "FFBFFBFRRL\n" +
                "FFFBFBBRRL\n" +
                "BFBBBFBRLL\n" +
                "BFBFFFFLLL\n" +
                "BFBFBBBRRL\n" +
                "FFFBBFBRLR\n" +
                "BBFBBBBRLL\n" +
                "FBFBBBFLRL\n" +
                "FFBFFBFRLR\n" +
                "BFBBBBFLLL\n" +
                "FFBBBBFLRL\n" +
                "BFFBFBFRRL\n" +
                "BFFFBBFLLR\n" +
                "BFFFBBFRRR\n" +
                "BFBFBFBLLL\n" +
                "BFFFFFBLLR\n" +
                "BFFFBBFLLL\n" +
                "BFBBBBFRRL\n" +
                "BBFFBBFLRR\n" +
                "BBBFFFFLRR\n" +
                "FFBFBFFLLR\n" +
                "FBFFBFFLLR\n" +
                "BFBFFFFRLR\n" +
                "FFBFFBFRLL\n" +
                "FFBFBFBLRL\n" +
                "BFFBBFFRRR\n" +
                "BFFFBBFLRR\n" +
                "FBFBFBBLRL\n" +
                "BFFBFFFLRL\n" +
                "FBFFBBBLRR\n" +
                "FBBFFFFLRL\n" +
                "BBBFFFBLRR\n" +
                "FBFFFBBRLL\n" +
                "BFBBFFFRLL\n" +
                "FFFBBBBLRR\n" +
                "BFBBBBBRRR\n" +
                "FBBBBBFRLL\n" +
                "BFBFFBBRLR\n" +
                "BFFFBFFLRL\n" +
                "FBFBFBFRRL\n" +
                "FBFFBFFRRR\n" +
                "FFBBFFBLRR\n" +
                "FFBFFBBRLR\n" +
                "FBBBFFFRLR\n" +
                "BFFBBBBLRR\n" +
                "FBFFFFBLRR\n" +
                "BFBBFFFLLR\n" +
                "FBFFBBBLLR\n" +
                "FBFFFBBRRR\n" +
                "BFFBFBBLLL\n" +
                "FFBBBBBRRR\n" +
                "BFBBFFBRRR\n" +
                "FBBBBBBRRL\n" +
                "BFBBFBFLRR\n" +
                "BBFBFFBRLL\n" +
                "FBFFFFBRLL\n" +
                "BFBFBBFLRL\n" +
                "BFBFFFFLLR\n" +
                "BFFFBBBLRL\n" +
                "BBFFFFFRLL\n" +
                "BBBFFBBRLR\n" +
                "BBFBBFBLRL\n" +
                "BBFBFFBLLR\n" +
                "BBFBFBFLRR\n" +
                "FFBBFFBRRL\n" +
                "FFBFBBBRLR\n" +
                "BBFFFFBRRR\n" +
                "BFBFFFBRLR\n" +
                "BBFFFFBLLR\n" +
                "BBFFBFFLRR\n" +
                "FBBFBFBRLR\n" +
                "FFBBBFFLRR\n" +
                "BFBBFFBRLL\n" +
                "FBFBBBBLLR\n" +
                "FBBFFFBRLL\n" +
                "FBBFFFBLRR\n" +
                "FBFFFBBLLR\n" +
                "BBFFFBBRLL\n" +
                "BBFBBBFRRR\n" +
                "FFBBFFFLLL\n" +
                "BFBBBFFRLR\n" +
                "BFBBFBBRLL\n" +
                "BFFFFFBLRR\n" +
                "BFBFBFBRLR\n" +
                "BFBFFBFLRL\n" +
                "FFBFBFBRLL\n" +
                "BBFFFBFLLR\n" +
                "FFBFBFBRLR\n" +
                "FFFBBBBLLR\n" +
                "FBFBBBBRRR\n" +
                "BBFBBBFLRL\n" +
                "BBFBBBFRRL\n" +
                "FBFFBBFLLR\n" +
                "FBFFBFBLRL\n" +
                "BBFBBFBRLR\n" +
                "BFFFFBBRLR\n" +
                "BBFFFBFRLL\n" +
                "BFBFFBBLRL\n" +
                "FFFBFBBLRL\n" +
                "FFBBBBFLLR\n" +
                "BBFBBFBRRL\n" +
                "BFBBFBFLRL\n" +
                "BBFFBBFLRL\n" +
                "BFBFFBFRLL\n" +
                "BFFFFBBRRR\n" +
                "BFFFFBFRLL\n" +
                "FFBBFFBLLL\n" +
                "BFBBBBBLRL\n" +
                "FBBBFFBRLL\n" +
                "FBBFFFFRLL\n" +
                "BFFBFFFRLR\n" +
                "BFBBFBBLRR\n" +
                "BBFBFFBLRR\n" +
                "FBBBBBBLRL\n" +
                "BBBFFFFLRL\n" +
                "FFBBFBBRLR\n" +
                "FFFBBBFRRR\n" +
                "FBFFFFBRLR\n" +
                "BBFFFFBLLL\n" +
                "BFBBBFBRRR\n" +
                "FFFBBBBLRL\n" +
                "FFBFBFFLRR\n" +
                "BBFBFBFLRL\n" +
                "BFBBBBBLRR\n" +
                "BBFFBFBRRL\n" +
                "FBBFBBFRRL\n" +
                "BFFFFFBLRL\n" +
                "FFBFBBFLLL\n" +
                "BFFBBFFLRL\n" +
                "BBBFFFFLLR\n" +
                "BFBFFBBRRL\n" +
                "FBBBBFBLLL\n" +
                "BBFFBBBLRL\n" +
                "FBFBFFFRLR\n" +
                "FFBBFFFLRL\n" +
                "BFFBBFBRLL\n" +
                "FBBFBBFRRR\n" +
                "FBFBBBFRRR\n" +
                "BFBFBBFRRL\n" +
                "FBBBFBFRRL\n" +
                "FBBBBBBRLL\n" +
                "FBFFFFBLLR\n" +
                "FBFBFBBRRR\n" +
                "BFBBBBFRRR\n" +
                "BBFFFFBLRL\n" +
                "BFBBFBBLRL\n" +
                "BFFBBFBRLR\n" +
                "BFFBFBBLLR\n" +
                "BFFFBBBRLL\n" +
                "FBBFFBFRRR\n" +
                "BFFBFBBLRR\n" +
                "FFBFFFFLRL\n" +
                "BFBBFBBRRL\n" +
                "FBBBFFFLRL\n" +
                "FFBFBFBLRR\n" +
                "FBFFFBBLLL\n" +
                "FBBFFBBLLL\n" +
                "BFBBBBBLLL\n" +
                "FFBBBFBRRR\n" +
                "FBBBBBBLLL\n" +
                "FBFFBBFRLR\n" +
                "FBFBBBBLRR\n" +
                "FFBBFFFRRR\n" +
                "BBBFFBBRRL\n" +
                "FBBBFBFRLL\n" +
                "BFFFBBBLRR\n" +
                "FFBFFBBLRR\n" +
                "BFFBBFFRLL\n" +
                "BFFBBBFRLL\n" +
                "BFFBFFFRLL\n" +
                "BFFFFFFLLR\n" +
                "FFBFFFBLLL\n" +
                "FBBFBFFRRL\n" +
                "FFBBFBBLRL\n" +
                "FFBBBBFRRL\n" +
                "FBBBFBBLLR\n" +
                "FFBFBFFLRL\n" +
                "FBFFBFBLRR\n" +
                "BFBBFFBLLL\n" +
                "BFFFBBFRLL\n" +
                "FBFFBBFRRL\n" +
                "BFFBFBBLRL\n" +
                "BFFFBFBRRR\n" +
                "FFFBBBFLLL\n" +
                "BBFFFFFLRR\n" +
                "BBFFFBFLLL\n" +
                "FBFFFFFRRL\n" +
                "BFBFFFFRRR\n" +
                "FFBFFFBLLR\n" +
                "FFFBBFBLRL\n" +
                "FBFFFBFLLL\n" +
                "FBBBBFBRRR\n" +
                "FBBFFFBRRL\n" +
                "FBBFFBFRLL\n" +
                "FBBBBFFRLL\n" +
                "BFBFFFBRRR\n" +
                "BFBBBFBRLR\n" +
                "FBBBFFBLLL\n" +
                "BBFFFBFLRR\n" +
                "BFBBFFBRRL\n" +
                "BBFBBBFRLR\n" +
                "BFFFBFFRLR\n" +
                "FBBBFBFLLR\n" +
                "FBFBFBFRLL\n" +
                "FBFBBBFRLL\n" +
                "FFBFFBBRLL\n" +
                "FBFFFBFRRL\n" +
                "BBFBFFBRLR\n" +
                "FBFFFFFLRL\n" +
                "BFFBBBFLRL\n" +
                "FFBFFBBLLL\n" +
                "FFFBFBFLLL\n" +
                "BFBBBFFLRR\n" +
                "BBBFFBBRLL\n" +
                "BBBFFBFRLL\n" +
                "FBBFBFBLLL\n" +
                "BFBFFFFRLL\n" +
                "FBFBFFBRLR\n" +
                "FFFBBFBRRR\n" +
                "FBBFFFBRLR\n" +
                "FFFBBBFLRR\n" +
                "BFBFFFBLLR\n" +
                "BFBBBFFRLL\n" +
                "BFBBFFBRLR\n" +
                "BFFFFBFRLR\n" +
                "BFFFFBBLRR\n" +
                "BBBFFFBLRL\n" +
                "FBBBFFBRRR\n" +
                "BFBBFFFLRR\n" +
                "FBBBBFBRLL\n" +
                "BBFFBFFRRL\n" +
                "FFFBBFFLRL\n" +
                "FBBBBFFRRR\n" +
                "FBBFBFFLRL\n" +
                "BFBBFBFRLL\n" +
                "FBFFFBFRLL\n" +
                "FBFBBFFLLL\n" +
                "BFFFBBFRLR\n" +
                "BFFFBFFLRR\n" +
                "FFFBFBFLRL\n" +
                "FBFFFFFRLL\n" +
                "FFBFFFFRRL\n" +
                "FFBBFBFLRR\n" +
                "FFBFBBFRLR\n" +
                "FBFBFBFRLR\n" +
                "FBFBFFFRLL\n" +
                "FFBFFBFLRR\n" +
                "BFBFFBFRLR\n" +
                "BFFBFFFLRR\n" +
                "BBFBFBBLLR\n" +
                "FBFBFBBRRL\n" +
                "BFFBBBBLRL\n" +
                "BBFFBBBRRR\n" +
                "FBFFBBFRLL\n" +
                "BFFFBBBRRL\n" +
                "FBBFFFBLLR\n" +
                "BFFBBFBLRR\n" +
                "BFBBBBFLRL\n" +
                "FBFFBFBLLR\n" +
                "BFFBFFBRLR\n" +
                "FBBBBBFLRL\n" +
                "FBFFFBBLRL\n" +
                "BBFBFFFRLR\n" +
                "BFFBFFBLRL\n" +
                "FBBBBFBLLR\n" +
                "FFBBFFFLRR\n" +
                "BBFBBFBLLL\n" +
                "BBFFFBBLLL\n" +
                "FBBFBBBRLR\n" +
                "FBBFBBBLLR\n" +
                "BFFFFBFLRR\n" +
                "FBBBFFBLRR\n" +
                "FBFBFFBRLL\n" +
                "BFFBBBBRRR\n" +
                "BFFFFFFRLL\n" +
                "FBFBBBBLRL\n" +
                "FFBFBBFLLR\n" +
                "BFBBFBBLLL\n" +
                "BBFBFBBRRR\n" +
                "BFFFBFBLLL\n" +
                "BFBBFFBLRL\n" +
                "FBBBFFFLLR\n" +
                "FFBFFBBRRR\n" +
                "BBFBBBFRLL\n" +
                "FBBFBBBLLL\n" +
                "FBFBBBFLRR\n" +
                "BFBBFBFRRR\n" +
                "BFFFBFBRRL\n" +
                "BBFFBBBLRR\n" +
                "FBBFBFFLRR\n" +
                "BFFBFFBRLL\n" +
                "BFBFFFBLLL\n" +
                "BBFBBBFLLL\n" +
                "BFBBFFFRRL\n" +
                "FFBFBFBRRR\n" +
                "BFFBBFFRRL\n" +
                "BFFBFBFRLR\n" +
                "FFBFFFBRRL\n" +
                "BFFFBFBLRR\n" +
                "FBFBFFBLLL\n" +
                "FBFBFBFLLR\n" +
                "BFFBBBBLLR\n" +
                "FBBFFBBLLR\n" +
                "FBBFFBFLLL\n" +
                "BBBFFFBRLR\n" +
                "FBFFFBFRLR\n" +
                "BBFFBFFLRL\n" +
                "BFBFBBBLLL\n" +
                "FBFFFFBRRR\n" +
                "BFFBFFBRRR\n" +
                "FFBBBBBLLL\n" +
                "BBFFFBFRLR\n" +
                "BFFFFFBLLL\n" +
                "FBFBFBBLRR\n" +
                "FBFFBBBRRL\n" +
                "FBBBBBFLRR\n" +
                "BBBFFBFLRR\n" +
                "FBFBFFFLRR\n" +
                "FBBBBBBRRR\n" +
                "BFFBBFBRRR\n" +
                "BFFBFBFLLL\n" +
                "BFBBFFBLRR\n" +
                "BBFFBFFLLL\n" +
                "BFFFFFFLRR\n" +
                "BFFFBFBRLL\n" +
                "FBFFBFBRLL\n" +
                "FBFFBBBRLR\n" +
                "BBFFBFFRLL\n" +
                "FFBBFBBLRR\n" +
                "FBBBBBBLRR\n" +
                "FBBBBFBRRL\n" +
                "BFFFFBBRRL\n" +
                "FFBFFFBLRR\n" +
                "FBBFBFFLLL\n" +
                "BBFFFBBLRL\n" +
                "BBFBFFBLRL\n" +
                "BBFBFBBRLL\n" +
                "FBFFFBBLRR\n" +
                "BFBBFBBLLR\n" +
                "FFFBBBFRLR\n" +
                "FBFBFBBLLL\n" +
                "FBFFFFFLRR\n" +
                "BFBFBFBRRR\n" +
                "FBBFBBBLRL\n" +
                "BBFBBFBRLL\n" +
                "FBBFFBBLRR\n" +
                "BBFFBBBLLR\n" +
                "FBBFFBBLRL\n" +
                "FBFBFFFRRR\n" +
                "BBFFFBBRLR\n" +
                "BFFFFFFRRR\n" +
                "BBFFBBFRRR\n" +
                "FBFFBBFLRL\n" +
                "FFBBFBFLLL\n" +
                "FBFBFFBRRR\n" +
                "BFBBBBFRLL\n" +
                "FBBFBFBLRR\n" +
                "FBFBFFFLRL\n" +
                "FBBFFFFLRR\n" +
                "BFBFBFFRRL\n" +
                "BBFFBFBLRL\n" +
                "FBFFFFBLLL\n" +
                "FFBBFFFLLR\n" +
                "FBBFBBBRRR\n" +
                "FBBBBBBRLR\n" +
                "BBFFFFFRLR\n" +
                "FFBBBFFLLL\n" +
                "FBBBBBFRRR\n" +
                "BFFBFFBLLL\n" +
                "BBFBBBBRLR\n" +
                "FFBBFBBLLR\n" +
                "FBFBFFFLLR\n" +
                "FBBFBFFRLL\n" +
                "FFBBFBBRRL\n" +
                "FBBFBFBRLL\n" +
                "FBBBBFBLRL\n" +
                "FFBBFFBLLR\n" +
                "BBFFBFBRRR\n" +
                "BFBFFFFRRL\n" +
                "BFFBFFFRRR\n" +
                "FBFBBFFLLR\n" +
                "FFFBBFBRLL\n" +
                "FFBBBBFRLL\n" +
                "FBBFBBFLLL\n" +
                "FBBFFBFLRL\n" +
                "FBFFBFBRRR\n" +
                "FFBBBFBLLL\n" +
                "FFBBBFFRRL\n" +
                "FBBFFBFLRR\n" +
                "FFFBFBFRRR\n" +
                "FFBBFBFRLL\n" +
                "BBFFBBBLLL\n" +
                "FBBBFFFRRL\n" +
                "BFBBFBFLLR\n" +
                "BBFBFFBRRR\n" +
                "FFBBBFBLRL\n" +
                "FFBFBBBRLL\n" +
                "FBFBFBBRLL\n" +
                "FFBFFFBLRL\n" +
                "BBFBFFFLLR\n" +
                "FBFFBFFLLL\n" +
                "FFBBBFFRRR\n" +
                "FBBFBFFLLR\n" +
                "BBFBFFBRRL\n" +
                "BBFBBBBRRR\n" +
                "FFBFFBFRRR\n" +
                "BFBFBFFLLL\n" +
                "BBFBFBFRLL\n" +
                "BBFBFBBLRL\n" +
                "BFBBFBBRLR\n" +
                "FBFFBBBRLL\n" +
                "FBBBBFFLRR\n" +
                "FFFBBBFLLR\n" +
                "BBFFFFBLRR\n" +
                "BBFFFFFRRL\n" +
                "FBFFBFFLRR\n" +
                "BFFFFFFLLL\n" +
                "FFFBBBBRRR\n" +
                "BFFFBFFRLL\n" +
                "FFBFBFFRLL\n" +
                "FFFBBBBLLL\n" +
                "FFBFFBBRRL\n" +
                "FFBFBBFRRR\n" +
                "BFBFBFBLRL\n" +
                "FBFFFFFRLR\n" +
                "BBFBFBFRRL\n" +
                "FFFBFBFRLL\n" +
                "BBBFFBBLLR\n" +
                "FFBFBBFRRL\n" +
                "BBBFFFFRRR\n" +
                "BBFBBFFRRL\n" +
                "FBBFBBBRLL\n" +
                "FFFBFBBRLL\n" +
                "FFBBBBBLRL\n" +
                "FFBBBFFLLR\n" +
                "BFBFFBBLLL\n" +
                "BFFBBFBLLR\n" +
                "BBFBBBFLRR\n" +
                "BBBFFBFLLR\n" +
                "FBBFFBFRRL\n" +
                "BBFFFBFLRL\n" +
                "FFBFBBFLRR\n" +
                "BFBBBFFLRL\n" +
                "BFFBFFFRRL\n" +
                "BBFBBFBLLR\n" +
                "BBFBFBBLLL\n" +
                "BFFBBFFRLR\n" +
                "FBBFFFFRRL\n" +
                "FBFBFBFLRR\n" +
                "BFFBFBBRRL\n" +
                "FFFBBFFRLL\n" +
                "FFBBBFBRLR\n" +
                "FFBBBBBRLL\n" +
                "BBFBFBFRRR\n" +
                "FBBFBBFRLL\n" +
                "BBBFFFBRLL\n" +
                "BFFBBBFRLR\n" +
                "BBFBBFFLLL\n" +
                "FBFFBBFLLL\n" +
                "BFFBBBBRLL\n" +
                "BBBFFFBLLR\n" +
                "BFBFFFFLRR\n" +
                "FBBFBBFLLR\n" +
                "FBBBFFBRLR\n" +
                "FBFBBFBRLL\n" +
                "FBFBFBFLLL\n" +
                "FBFBBBFRLR\n" +
                "BBBFFFFRLL\n" +
                "FBFFBBFLRR\n" +
                "FBBBFBBRLR\n" +
                "FFBBBFFRLR\n" +
                "BBFFBFBLRR\n" +
                "FFFBBBBRRL\n" +
                "BFBFFFBRRL\n" +
                "BFBFBFBLLR\n" +
                "FFBBBFBRRL\n" +
                "FBFBBBBRLL\n" +
                "BBFFBFBLLR\n" +
                "FFBFFFFLLR\n" +
                "FBBFBBBRRL\n" +
                "FBFBBBBLLL\n" +
                "BFBFFBFLRR\n" +
                "FFBFFFBRRR\n" +
                "FFFBBFFRRR\n" +
                "BBBFFBBLRR\n" +
                "FBFFBFFRRL\n" +
                "BFFFBFBRLR\n" +
                "BFFBBFFLRR\n" +
                "FBBBBFFRLR\n" +
                "BFBBFFFLRL\n" +
                "FBFFFBFLRR\n" +
                "FFBBFBFRLR\n" +
                "FBBBFBFLRR\n" +
                "BBBFFFBLLL\n" +
                "BBBFFBBLLL\n" +
                "FBBBFFFRRR\n" +
                "BBFFFFFLLL\n" +
                "FBBBBBFLLL\n" +
                "FFFBBFFRRL\n" +
                "FFFBFBBLRR\n" +
                "FBBBBFFLLR\n" +
                "BFBFFFBLRR\n" +
                "FBBBFBBLRL\n" +
                "BFBBBFFRRR\n" +
                "BFBFFBBRRR\n" +
                "BFFFFBFLRL\n" +
                "BFBBBBFLRR\n" +
                "BFFFFFFRRL\n" +
                "BBFBBFFRRR\n" +
                "FFBFBFFRLR\n" +
                "BBFBBFFLLR\n" +
                "BFBFBFFRLR\n" +
                "FFFBFBFRRL\n" +
                "FFBFFBBLLR\n" +
                "FBFBBFBLLR\n" +
                "BFBFBFBRRL\n" +
                "FFBBFBFRRR\n" +
                "FFBFBFBRRL\n" +
                "FBBFBBBLRR\n" +
                "FBBFFBBRLR\n" +
                "BFFFFBFLLL\n" +
                "BFBFFBBLRR\n" +
                "BBFFFBFRRL\n" +
                "BBFBBFFRLR\n" +
                "BFBBFFFRLR\n" +
                "FBFFFFFLLL\n" +
                "BBFFFFBRRL\n" +
                "BFBFBFFLRL\n" +
                "BBFFBBFRLL\n" +
                "BFFBFBFLRL\n" +
                "FBFBBBFLLR\n" +
                "FBBFBFBRRL\n" +
                "FFFBBBBRLR\n" +
                "BFBFFFBLRL\n" +
                "BFFFFFBRRR\n" +
                "BBFBFBBLRR\n" +
                "BFFFFFBRRL\n" +
                "BBBFFFFRRL\n" +
                "BFFBBBFRRL\n" +
                "FBFFBFBLLL\n" +
                "FBBBFFFLLL\n" +
                "FFBBBBFLRR\n" +
                "FFBFFBFLLR\n" +
                "BFBFBFFRRR\n" +
                "FBFBBFBLLL\n" +
                "BFFBBFBLRL\n" +
                "BFFBBBFLRR\n" +
                "FFBFBFFLLL\n" +
                "BFFFBFFRRR\n" +
                "FBFFFFFLLR\n" +
                "BBFBBFFLRR\n" +
                "FFBFFFBRLR\n" +
                "BFBFFFBRLL\n" +
                "BFFBFBFRLL\n" +
                "FFBBFFFRLL\n" +
                "FBFFFBBRRL\n" +
                "BFFFBBBRRR\n" +
                "FBFBBBBRRL\n" +
                "FBBFFFFLLL\n" +
                "FBBBFFBLRL\n" +
                "FBFFBFFRLL\n" +
                "FFFBBFFRLR\n" +
                "BFBFBBFRRR\n" +
                "BFBBFFFRRR\n" +
                "FFBBBFFLRL\n" +
                "BBFFFFFLRL\n" +
                "FFBFBBBLRR\n" +
                "BFFFFFBRLR\n" +
                "FBBFFBBRLL\n" +
                "FBFBBFFRLR\n" +
                "FFBBBFBLRR\n" +
                "FBBFBFBLRL\n" +
                "FBBFFBBRRR\n" +
                "FFFBBFBLRR\n" +
                "BFBFBBFLLR\n" +
                "BBBFFBBLRL\n" +
                "BFFFBBBLLL\n" +
                "BBFFFFFRRR\n" +
                "FFBBBBFRRR\n" +
                "FBFBFBFRRR\n" +
                "FFBFBFFRRR\n" +
                "FFBBFFBRRR\n" +
                "BFBFBFFRLL\n" +
                "BFBFFBFRRR\n" +
                "BBFFFBFRRR\n" +
                "BFFFFBBLLR\n" +
                "FFBBFBBLLL\n" +
                "FBFBBBBRLR\n" +
                "FBFBBFBLRR\n" +
                "BFBFBBFRLR\n" +
                "FBBBFBBRRL\n" +
                "FBFBFFFLLL\n" +
                "FFBBFBBRLL\n" +
                "BBFBBBBLRR\n" +
                "FBBFFBBRRL\n" +
                "BFBBBFBLLR\n" +
                "FFFBBFFLLR\n" +
                "FBBBBBFRRL\n" +
                "BFBBFFFLLL\n" +
                "BBFBBBBLLL\n" +
                "BFBFBBBRLR\n" +
                "BFFBBBFLLL\n" +
                "BFBBFBFRRL\n" +
                "BBFBFFFRRL\n" +
                "FFBBBFBLLR\n" +
                "FBFBBFBLRL\n" +
                "BBBFFFBRRL\n" +
                "BBFBFFBLLL\n" +
                "BBFBFFFLRR\n" +
                "FFBFBFBLLR\n" +
                "BFBFFFFLRL\n" +
                "BFBBBBBRRL\n" +
                "BBFFFBBRRR\n" +
                "BBFFBBFLLR\n" +
                "FBFFBBBLLL\n" +
                "BFFFFFFLRL\n" +
                "FBFBFBBRLR\n" +
                "FBBBFFFLRR\n" +
                "BBBFFFFRLR\n" +
                "FFBBFFBRLR\n" +
                "BBFBFFFRLL\n" +
                "BBFBFBFLLR\n" +
                "BFFFFBFLLR\n" +
                "FBFBFFFRRL\n" +
                "BFFFFBBLLL\n" +
                "FFFBBFFLLL\n" +
                "BFFFFBFRRR\n" +
                "FBBBFBFRLR\n" +
                "FBBBFBBLLL\n" +
                "BFFFFBBLRL\n" +
                "FBFFBFBRRL\n" +
                "BBFBBBBLLR\n" +
                "BFBBBFBLRL\n" +
                "FBFBBFFLRL\n" +
                "BFBFBBBLLR\n" +
                "FFBBFBFLLR\n" +
                "FFBFFFBRLL\n" +
                "BFFBFFBLRR\n" +
                "BFFBFFFLLL\n" +
                "BFFBBFFLLR\n" +
                "BBFFBBBRLR\n" +
                "BFFBBFBLLL\n" +
                "FBFBBFBRRL\n" +
                "FBFFFBBRLR\n" +
                "BFFBBBFRRR\n" +
                "FFBFFBBLRL\n" +
                "FBFBBFBRRR\n" +
                "BBFFBBBRRL\n" +
                "FBFBBBFRRL\n" +
                "BBFBBFBRRR\n" +
                "BBBFFFFLLL\n" +
                "BFBFBBFLRR\n" +
                "FBFFBBBRRR\n" +
                "BFBBFBFRLR\n" +
                "BBFBBFFLRL\n" +
                "BBFFBBBRLL";

        String[] seatCodes = formatSeatBatch(seatBatch);
        List<Integer> seats = getListOfAllSeatIds(seatCodes);
        int ownSeatId = getOwnSeatId(seats);
        System.out.println(ownSeatId);
    }

    private static int getOwnSeatId(List<Integer> seats) {
        for (int i = 0; i < seats.size(); i++) {
            if (seats.get(i) + 1 != seats.get(i + 1)) {
                return seats.get(i) + 1;
            }
        }
        return 0;
    }


    public static List<Integer> getListOfAllSeatIds(String[] seatCodes) {
        List<Integer> seatIds = new ArrayList<>();
        for (String seatCode : seatCodes) {
            int row = getPlace(seatCode, 128, 'F', 'B');
            int column = getPlace(seatCode, 8, 'L', 'R');
            seatIds.add((row * 8) + column);
        }

        Collections.sort(seatIds);
        return seatIds;
    }

    private static int getPlace(String seatCode, int length, char directionDown, char directionUp) {

        int[] range = {0, length - 1};

        int start = 0;
        int end = seatCode.length();

        if (length == 128) {
            end = seatCode.length() - 3;
        } else {
            start = seatCode.length() - 3;
        }

        for (int i = start; i < end; i++) {
            length = length / 2;
            if (seatCode.charAt(i) == directionDown) {
                range[1] = range[1] - length;

            } else if (seatCode.charAt(i) == directionUp) {
                range[0] = range[0] + length;
            }
        }
        return range[0];
    }


    private static String[] formatSeatBatch(String seatBatch) {
        return seatBatch.split("\n");
    }
}
