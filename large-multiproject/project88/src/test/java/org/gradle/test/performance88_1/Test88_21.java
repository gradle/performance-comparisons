package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_21 {
    private final Production88_21 production = new Production88_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}