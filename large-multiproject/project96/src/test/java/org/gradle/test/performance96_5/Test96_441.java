package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_441 {
    private final Production96_441 production = new Production96_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}