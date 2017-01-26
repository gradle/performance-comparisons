package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_443 {
    private final Production96_443 production = new Production96_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}