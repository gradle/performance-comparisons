package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_399 {
    private final Production96_399 production = new Production96_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}