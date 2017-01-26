package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_485 {
    private final Production96_485 production = new Production96_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}