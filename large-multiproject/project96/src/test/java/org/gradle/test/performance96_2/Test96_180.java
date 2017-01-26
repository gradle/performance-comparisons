package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_180 {
    private final Production96_180 production = new Production96_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}