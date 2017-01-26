package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_453 {
    private final Production96_453 production = new Production96_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}