package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_21 {
    private final Production86_21 production = new Production86_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}