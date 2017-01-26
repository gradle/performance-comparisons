package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_284 {
    private final Production96_284 production = new Production96_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}