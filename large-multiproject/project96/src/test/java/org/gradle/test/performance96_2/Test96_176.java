package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_176 {
    private final Production96_176 production = new Production96_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}