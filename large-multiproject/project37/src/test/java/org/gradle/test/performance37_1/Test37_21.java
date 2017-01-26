package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_21 {
    private final Production37_21 production = new Production37_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}