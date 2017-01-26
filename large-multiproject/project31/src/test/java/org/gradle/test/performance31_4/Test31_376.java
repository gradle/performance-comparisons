package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_376 {
    private final Production31_376 production = new Production31_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}