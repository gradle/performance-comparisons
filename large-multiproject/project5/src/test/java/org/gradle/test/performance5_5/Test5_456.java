package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_456 {
    private final Production5_456 production = new Production5_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}