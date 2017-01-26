package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_339 {
    private final Production96_339 production = new Production96_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}