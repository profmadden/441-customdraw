package edu.binghamton.cs.androidsurface;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CustomGraph extends SurfaceView implements SurfaceHolder.Callback {
    public SurfaceHolder surfaceHolder = null;
    private Paint paint = null;
    private float x, y;

    public CustomGraph(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
    }
    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }
    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        paint = null;

    }

    /* This method will be invoked to draw a circle in canvas. */
    public void draw()
    {
        surfaceHolder = getHolder();

        // Get and lock canvas object from surfaceHolder.
        Canvas canvas = surfaceHolder.lockCanvas();

        Paint surfaceBackground = new Paint();
        // Set the surfaceview background color.
        surfaceBackground.setColor(Color.BLACK);
        // Draw the surfaceview background color.
        canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), surfaceBackground);

        // Draw the circle.
        paint.setColor(Color.RED);
        canvas.drawCircle(x, y, 100, paint);

        // Unlock the canvas object and post the new draw.
        surfaceHolder.unlockCanvasAndPost(canvas);
    }


    public void setX(float x) {
        this.x = (float) (0.01 * x * this.getWidth());
    }
    public void setY(float y) {
        this.y = (float) (0.01 * y * this.getHeight());
    }

}
