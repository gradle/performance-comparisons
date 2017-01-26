package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_170 {
    private final Production96_170 production = new Production96_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}