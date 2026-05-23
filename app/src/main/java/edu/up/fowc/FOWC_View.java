package edu.up.fowc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;


public class FOWC_View extends SurfaceView {

    private FOWC_State fowcState;

    private FOWC_Paints paints;

    // TODO: change to proportions of view size.
    // TODO: wrap in separate class.
    public static final float boardTop = 100.0f;
    public static final float boardLeft = 100.0f;
    public static final float squareSideLength = 100.0f;


    public FOWC_View(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.fowcState = new FOWC_State();

        this.paints = new FOWC_Paints();
        setBackgroundColor(this.paints.background.getColor());
        setWillNotDraw(false);
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        for (int rowShift = 0; rowShift < FOWC_State.NUM_RANKS; rowShift++)
        {
            for (int colShift = 0; colShift < FOWC_State.NUM_FILES; colShift++)
            {
                float squareLeft = boardLeft + colShift * squareSideLength;
                float squareTop = boardTop + rowShift * squareSideLength;
                float squareRight = squareLeft + squareSideLength;
                float squareBottom = squareTop + squareSideLength;
                boolean squareIsWhite = (rowShift + colShift) % 2 == 0; // This implements the standard "white is on the (bottom) right" layout.
                Paint squarePaint = squareIsWhite ? this.paints.whiteSquare : this.paints.blackSquare;
                canvas.drawRect(squareLeft, squareTop, squareRight, squareBottom, squarePaint);
            }
        }

        // Test out translucent fog.
        int numRanksToFog = 2;
        canvas.drawRect(boardLeft, boardTop, boardLeft + FOWC_State.NUM_FILES * squareSideLength, boardTop + numRanksToFog * squareSideLength, this.paints.fog);

    }


}
