package com.github.easyguide.layer

import android.graphics.Rect
import android.view.View

/**
 * Created by shenxl on 2018/10/25.
 */
enum class Location {
    /**
     * Rule that covers the target with extra-view in the same size
     */
    COVER,
    /**
     * Rule that aligns the target's left edge with extra-view's own right edge
     */
    TO_LEFT,
    /**
     * Rule that aligns the target's right edge with extra-view's own left edge
     */
    TO_RIGHT,
    /**
     * Rule that aligns the target's top edge with extra-view's own bottom edge
     */
    TO_TOP,
    /**
     * Rule that aligns the target's bottom edge with extra-view's own top edge
     */
    TO_BOTTOM,
    /**
     * Rule that aligns the target's top edge with extra-view's own top edge
     */
    ALIGN_TOP,
    /**
     * Rule that aligns the target's bottom edge with extra-view's own bottom edge
     */
    ALIGN_BOTTOM,
    /**
     * Rule that aligns the target's left edge with extra-view's left edge
     */
    ALIGN_LEFT,
    /**
     * Rule that aligns the target's right edge with extra-view's own right edge
     */
    ALIGN_RIGHT;

    companion object {
        fun getViewAbsRect(view: View): Rect {
            val locView = IntArray(2)
            view.getLocationOnScreen(locView)
            return Rect().apply {
                set(locView[0], locView[1], locView[0] + view.measuredWidth, locView[1] + view.measuredHeight)
            }
        }
    }
}
