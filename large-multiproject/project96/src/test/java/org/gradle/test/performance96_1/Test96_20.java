package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_20 {
    private final Production96_20 production = new Production96_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}