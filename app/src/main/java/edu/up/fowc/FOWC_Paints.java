package edu.up.fowc;

import android.graphics.Color;
import android.graphics.Paint;

public class FOWC_Paints {

    Paint background = new Paint();
    Paint fog = new Paint();
    Paint boardLine = new Paint();
    Paint whiteSquare = new Paint();
    Paint whitePieceFill = new Paint();
    Paint whitePieceStroke = new Paint();
    Paint blackSquare = new Paint();
    Paint blackPieceFill = new Paint();
    Paint blackPieceStroke = new Paint();

    public FOWC_Paints()
    {
        this.background.setColor(Color.GRAY); // Style is unused.

        this.fog.setColor(this.background.getColor());
        this.fog.setAlpha(200);
        this.fog.setStyle(Paint.Style.FILL);

        this.boardLine.setColor(Color.DKGRAY);
        this.boardLine.setStyle(Paint.Style.STROKE);

        this.whiteSquare.setColor(Color.WHITE);
        this.whiteSquare.setStyle(Paint.Style.FILL);

        this.whitePieceFill.setColor(Color.WHITE);
        this.whitePieceFill.setStyle(Paint.Style.FILL);

        this.whitePieceStroke.setColor(Color.BLACK);
        this.whitePieceStroke.setStyle(Paint.Style.STROKE);

        this.blackSquare.setColor(Color.BLACK);
        this.blackSquare.setStyle(Paint.Style.FILL);

        this.blackPieceFill.setColor(Color.BLACK);
        this.blackPieceFill.setStyle(Paint.Style.FILL);

        this.blackPieceStroke.setColor(Color.WHITE);
        this.blackPieceStroke.setStyle(Paint.Style.STROKE);
    }

}
