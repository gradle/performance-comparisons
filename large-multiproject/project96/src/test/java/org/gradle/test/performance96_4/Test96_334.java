package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_334 {
    private final Production96_334 production = new Production96_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}