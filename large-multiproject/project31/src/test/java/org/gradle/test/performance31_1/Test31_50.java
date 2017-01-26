package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_50 {
    private final Production31_50 production = new Production31_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}