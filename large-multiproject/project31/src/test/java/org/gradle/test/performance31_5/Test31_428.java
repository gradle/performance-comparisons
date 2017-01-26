package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_428 {
    private final Production31_428 production = new Production31_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}