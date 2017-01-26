package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_21 {
    private final Production5_21 production = new Production5_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}