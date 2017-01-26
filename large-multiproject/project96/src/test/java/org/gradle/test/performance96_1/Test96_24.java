package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_24 {
    private final Production96_24 production = new Production96_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}