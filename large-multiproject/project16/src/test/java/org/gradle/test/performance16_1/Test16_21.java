package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_21 {
    private final Production16_21 production = new Production16_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}