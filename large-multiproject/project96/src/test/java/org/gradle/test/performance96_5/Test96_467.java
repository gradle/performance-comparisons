package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_467 {
    private final Production96_467 production = new Production96_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}