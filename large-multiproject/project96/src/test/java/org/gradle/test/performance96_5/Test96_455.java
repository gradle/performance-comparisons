package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_455 {
    private final Production96_455 production = new Production96_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}