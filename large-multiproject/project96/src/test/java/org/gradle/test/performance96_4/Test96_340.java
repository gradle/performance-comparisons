package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_340 {
    private final Production96_340 production = new Production96_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}