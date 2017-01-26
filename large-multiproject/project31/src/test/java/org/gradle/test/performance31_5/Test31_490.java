package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_490 {
    private final Production31_490 production = new Production31_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}