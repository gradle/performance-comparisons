package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_244 {
    private final Production96_244 production = new Production96_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}