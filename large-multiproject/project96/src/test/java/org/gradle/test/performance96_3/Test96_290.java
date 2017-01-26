package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_290 {
    private final Production96_290 production = new Production96_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}