package com.squareup.timessquare;

import android.widget.TextView;

/**
 * Created by Michal on 30/11/15.
 */
public class DefaultCalendarAdapter implements CalendarAdapter {

    @Override
    public void makeCellView(CalendarCellView parent) {
        TextView textView = new TextView(parent.getContext());
        parent.addView(textView);
        parent.setDayOfMonthTextView(textView);
    }

}
