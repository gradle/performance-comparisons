package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_438 {
    private final Production96_438 production = new Production96_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}