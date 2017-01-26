package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_400 {
    private final Production96_400 production = new Production96_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}