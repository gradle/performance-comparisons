package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_21 {
    private final Production7_21 production = new Production7_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}