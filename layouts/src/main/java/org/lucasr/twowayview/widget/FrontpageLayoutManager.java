package org.lucasr.twowayview.widget;

import android.view.View;

import org.lucasr.twowayview.TwoWayLayoutManager;

/**
 * Created by bentrengrove on 23/06/15.
 */
public class FrontpageLayoutManager extends SpannableGridLayoutManager {
    public FrontpageLayoutManager(Orientation orientation, int numColumns, int numRows) {
        super(orientation, numColumns, numRows);
    }

    @Override
    void getLaneForChild(Lanes.LaneInfo outInfo, View child, Direction direction) {
        super.getLaneForChild(outInfo, child, direction);
        LayoutParams params = (LayoutParams)child.getLayoutParams();
        if (params.colSpan == 1 && params.rowSpan == 2) {
            outInfo.set(2, 2);
        } else if (params.colSpan == 2 && params.rowSpan == 2) {
            outInfo.set(0, 0);
        }
    }
}
