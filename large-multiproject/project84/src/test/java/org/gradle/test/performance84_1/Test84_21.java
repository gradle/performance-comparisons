package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_21 {
    private final Production84_21 production = new Production84_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}