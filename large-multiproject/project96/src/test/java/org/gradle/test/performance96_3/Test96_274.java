package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_274 {
    private final Production96_274 production = new Production96_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}