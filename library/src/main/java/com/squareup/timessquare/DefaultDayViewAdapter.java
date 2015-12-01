package com.squareup.timessquare;

import android.view.ContextThemeWrapper;
import android.widget.TextView;

/**
 * Created by Michal on 30/11/15.
 */
public class DefaultDayViewAdapter implements DayViewAdapter {

    @Override
    public void makeCellView(CalendarCellView parent) {
        TextView textView = new TextView(new ContextThemeWrapper(parent.getContext(), R.style.CalendarCell_CalendarDate));
        textView.setDuplicateParentStateEnabled(true);
        parent.addView(textView);
        parent.setDayOfMonthTextView(textView);
    }

}
