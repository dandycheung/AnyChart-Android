package com.anychart.core.axes;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.VisualBase;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Map axes settings class.
 */
public class MapSettings extends VisualBase {

    protected MapSettings() {

    }

    public static MapSettings instantiate() {
        return new MapSettings("new anychart.core.axes.mapSettings()");
    }

    

    public MapSettings(String jsChart) {
        jsBase = "mapSettings" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the bottom axis.
     */
    public com.anychart.core.axes.Map bottom() {
        return new com.anychart.core.axes.Map(jsBase + ".bottom()");
    }
    /**
     * Setter for the bottom axis.
     */
    public com.anychart.core.axes.MapSettings bottom(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", settings));

        return this;
    }
    /**
     * Setter for the bottom axis.
     */
    public com.anychart.core.axes.MapSettings bottom(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the first label drawing flag.
     */
    public void drawFirstLabel() {
        APIlib.getInstance().addJSLine(jsBase + ".drawFirstLabel();");
    }
    /**
     * Setter for the first label drawing flag.
     */
    public com.anychart.core.axes.MapSettings drawFirstLabel(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drawFirstLabel(%s);", enabled));

        return this;
    }
    /**
     * Getter for the last label drawing flag.
     */
    public void drawLastLabel() {
        APIlib.getInstance().addJSLine(jsBase + ".drawLastLabel();");
    }
    /**
     * Setter for the last label drawing flag.
     */
    public com.anychart.core.axes.MapSettings drawLastLabel(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drawLastLabel(%s);", enabled));

        return this;
    }
    /**
     * Getter for the axis enabled state.
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the axis enabled state.
     */
    public com.anychart.core.axes.MapSettings enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Getter for axis labels.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for axis labels.
     */
    public com.anychart.core.axes.MapSettings labels(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for axis labels.
     */
    public com.anychart.core.axes.MapSettings labels(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", settings));

        return this;
    }
    /**
     * Getter for the left axis.
     */
    public com.anychart.core.axes.Map left() {
        return new com.anychart.core.axes.Map(jsBase + ".left()");
    }
    /**
     * Setter for the left axis.
     */
    public com.anychart.core.axes.MapSettings left(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", settings));

        return this;
    }
    /**
     * Setter for the left axis.
     */
    public com.anychart.core.axes.MapSettings left(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for axis minor labels.
     */
    public com.anychart.core.ui.LabelsFactory minorLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".minorLabels()");
    }
    /**
     * Setter for axis minor labels.
     */
    public com.anychart.core.axes.MapSettings minorLabels(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorLabels(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for axis minor labels.
     */
    public com.anychart.core.axes.MapSettings minorLabels(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorLabels(%s);", settings));

        return this;
    }
    /**
     * Getter for minor axis ticks.
     */
    public com.anychart.core.axes.MapTicks minorTicks() {
        return new com.anychart.core.axes.MapTicks(jsBase + ".minorTicks()");
    }
    /**
     * Setter for minor axis ticks.
     */
    public com.anychart.core.axes.MapSettings minorTicks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for minor axis ticks.
     */
    public com.anychart.core.axes.MapSettings minorTicks(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", settings));

        return this;
    }
    /**
     * Getter for labels overlap mode.
     */
    public void overlapMode() {
        APIlib.getInstance().addJSLine(jsBase + ".overlapMode();");
    }
    /**
     * Setter for labels overlap mode.
     */
    public com.anychart.core.axes.MapSettings overlapMode(com.anychart.enums.LabelsOverlapMode mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for labels overlap mode.
     */
    public com.anychart.core.axes.MapSettings overlapMode(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", wrapQuotes(mode)));

        return this;
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(com.anychart.graphics.vector.PaperSize paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", (paperSizeOrOptions != null) ? paperSizeOrOptions.getJsBase() : null, landscape));
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(String paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrOptions), landscape));
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for the right axis.
     */
    public com.anychart.core.axes.Map right() {
        return new com.anychart.core.axes.Map(jsBase + ".right()");
    }
    /**
     * Setter for the right axis.
     */
    public com.anychart.core.axes.MapSettings right(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", settings));

        return this;
    }
    /**
     * Setter for the right axis.
     */
    public com.anychart.core.axes.MapSettings right(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for axis stroke settings.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(com.anychart.graphics.vector.Stroke value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(com.anychart.graphics.vector.ColoredFill value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", (value != null) ? value.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(String value, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(String value, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for axis stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.axes.MapSettings stroke(String value, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(value), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for axis stroke settings using an object.
     */
    public com.anychart.core.axes.MapSettings stroke(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for axis ticks.
     */
    public com.anychart.core.axes.MapTicks ticks() {
        return new com.anychart.core.axes.MapTicks(jsBase + ".ticks()");
    }
    /**
     * Setter for axis ticks.
     */
    public com.anychart.core.axes.MapSettings ticks(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for axis ticks.
     */
    public com.anychart.core.axes.MapSettings ticks(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", settings));

        return this;
    }
    /**
     * Getter for the axis title.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for the axis title.
     */
    public com.anychart.core.axes.MapSettings title(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", settings));

        return this;
    }
    /**
     * Setter for the axis title.
     */
    public com.anychart.core.axes.MapSettings title(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the top axis.
     */
    public com.anychart.core.axes.Map top() {
        return new com.anychart.core.axes.Map(jsBase + ".top()");
    }
    /**
     * Setter for the top axis.
     */
    public com.anychart.core.axes.MapSettings top(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", settings));

        return this;
    }
    /**
     * Setter for the top axis.
     */
    public com.anychart.core.axes.MapSettings top(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(settings)));

        return this;
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }

    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener, String type, String ePath) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(String.format(Locale.US, ".listen('%1$s', function(e) {", type));

        if (listener.getFields() != null) {
            ePath = (ePath != null) ? ePath + "." : "";
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.%2$s%1$s + ',' +", field, ePath));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Getter for the Z-index of the element.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the element.
     */
    public com.anychart.core.axes.MapSettings zIndex(Number zIndex) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", zIndex));

        return this;
    }
    /**
     * Getter for the container.
     */
    public com.anychart.graphics.vector.Layer container() {
        return new com.anychart.graphics.vector.Layer(jsBase + ".container()");
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.axes.MapSettings container(com.anychart.graphics.vector.Layer element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.axes.MapSettings container(com.anychart.graphics.vector.Stage element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.axes.MapSettings container(String element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(element)));

        return this;
    }
    /**
     * Getter for the parent bounds.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.math.Rect parentBounds() {
        return new com.anychart.math.Rect(jsBase + ".parentBounds()");
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.axes.MapSettings parentBounds(com.anychart.math.Rect bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.axes.MapSettings parentBounds(String bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(bounds)));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.axes.MapSettings parentBounds(Number bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", bounds));

        return this;
    }
    /**
     * Setter for the parent bounds using several values.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.axes.MapSettings parentBounds(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));

        return this;
    }

}