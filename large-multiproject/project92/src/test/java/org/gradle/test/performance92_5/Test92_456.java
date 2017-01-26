package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_456 {
    private final Production92_456 production = new Production92_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}