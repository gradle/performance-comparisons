package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_470 {
    private final Production96_470 production = new Production96_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}