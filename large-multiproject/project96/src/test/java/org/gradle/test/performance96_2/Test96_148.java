package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_148 {
    private final Production96_148 production = new Production96_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}