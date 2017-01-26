package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_456 {
    private final Production72_456 production = new Production72_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}