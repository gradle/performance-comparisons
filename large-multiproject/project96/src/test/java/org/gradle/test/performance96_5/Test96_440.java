package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_440 {
    private final Production96_440 production = new Production96_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}