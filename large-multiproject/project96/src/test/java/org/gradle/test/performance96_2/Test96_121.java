package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_121 {
    private final Production96_121 production = new Production96_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}