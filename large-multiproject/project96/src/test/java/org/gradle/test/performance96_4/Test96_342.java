package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_342 {
    private final Production96_342 production = new Production96_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}