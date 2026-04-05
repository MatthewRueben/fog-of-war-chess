package edu.up.fogofwarchess;

import java.util.HashSet;

public class FOWC_State
{
    public static final int NUM_FILES = 8;
    public static final int NUM_RANKS = 8;

    FOWC_Piece[][] board;
    HashSet<FOWC_Piece>[][][] visibleTo;


    public FOWC_State()
    {
        this.board = new FOWC_Piece[NUM_FILES][NUM_RANKS];

        int numPlayers = 2; // TODO: replace hardcoded value.
        this.visibleTo = new HashSet[numPlayers][NUM_FILES][NUM_RANKS];

        // TODO: Set up standard arrangement of pieces. Make sure visibleTo populates.
    }


}
