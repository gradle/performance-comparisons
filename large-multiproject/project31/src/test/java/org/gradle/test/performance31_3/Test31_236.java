package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_236 {
    private final Production31_236 production = new Production31_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}