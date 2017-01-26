package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_129 {
    private final Production96_129 production = new Production96_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}