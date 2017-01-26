package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_493 {
    private final Production31_493 production = new Production31_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}