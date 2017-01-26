package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_499 {
    private final Production96_499 production = new Production96_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}