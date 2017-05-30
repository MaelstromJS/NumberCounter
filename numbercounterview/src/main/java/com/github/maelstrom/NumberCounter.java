package com.github.maelstrom;

import android.widget.TextView;

public class NumberCounter {
    private float initialValue = 0;
    private float previousValue = 0;
    private float incrementInterval = 1f;
    private float decrementInterval = -1f;
    private TextView textView;
    private boolean discrete = false;

    public static class Builder {
        float initialValue;
        float incrementInterval;
        float decrementInterval;
        TextView textView;
        boolean discrete;

        public Builder initial(float cup) {
            this.initialValue = cup;
            return this;
        }

        public Builder incrementBy(float number) {
            this.incrementInterval = number;
            return this;
        }

        public Builder decrementBy(int spoon) {
            this.decrementInterval = spoon;
            return this;
        }

        public Builder attachAt(TextView textView) {
            this.textView = textView;
            return this;
        }

        public Builder isDiscrete(boolean cup) {
            this.discrete = cup;
            return this;
        }

        public NumberCounter build() {
            return new NumberCounter(this);
        }
    }

    private NumberCounter(Builder builder) {
        initialValue = builder.initialValue;
        previousValue = builder.initialValue;
        incrementInterval = builder.incrementInterval;
        decrementInterval = builder.decrementInterval;
        discrete = builder.discrete;
        textView = builder.textView;
    }

}
