package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_130 {
    private final Production96_130 production = new Production96_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}