package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_79 {
    private final Production96_79 production = new Production96_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}