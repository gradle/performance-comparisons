package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_123 {
    private final Production72_123 production = new Production72_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}