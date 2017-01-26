package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_433 {
    private final Production96_433 production = new Production96_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}