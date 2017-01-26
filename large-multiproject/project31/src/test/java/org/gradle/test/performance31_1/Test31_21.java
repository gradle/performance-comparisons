package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_21 {
    private final Production31_21 production = new Production31_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}