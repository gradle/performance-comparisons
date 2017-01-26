package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_21 {
    private final Production30_21 production = new Production30_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}