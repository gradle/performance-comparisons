package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_101 {
    private final Production96_101 production = new Production96_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}