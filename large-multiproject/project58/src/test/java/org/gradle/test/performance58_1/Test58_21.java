package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_21 {
    private final Production58_21 production = new Production58_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}