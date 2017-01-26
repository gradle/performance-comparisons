package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_452 {
    private final Production96_452 production = new Production96_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}