package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_480 {
    private final Production96_480 production = new Production96_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}