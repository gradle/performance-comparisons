package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_201 {
    private final Production96_201 production = new Production96_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}