package app.comicwar.ui;

import android.view.View;

import android.content.Context;

import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class ComicButton extends AppCompatButton {

    private View.OnClickListener mOnClickListener;

    public ComicButton(final Context context) {
        this(context, null);
    }

    public ComicButton(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        super.setOnClickListener(l);
        mOnClickListener = l;
    }
}
