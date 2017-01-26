package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_158 {
    private final Production96_158 production = new Production96_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}