package edu.up.fogofwarchess;

public abstract class FOWC_Piece
{
    // Color.
    public static final boolean BLACK = true;
    public static final boolean WHITE = false;
    private boolean color;
    public boolean colorIs(boolean color) { return this.color == color; }

    // Movement/Vision.
    /*
    Since this piece doesn't know where it is on the board...
    ...I think it will just say what offsets it can see at.
    Ray casting, including checking for bounds and other pieces,
    will have to happen elsewhere.
     */


}
