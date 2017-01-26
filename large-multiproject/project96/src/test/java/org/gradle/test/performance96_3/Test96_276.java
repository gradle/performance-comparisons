package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_276 {
    private final Production96_276 production = new Production96_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}