package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_456 {
    private final Production30_456 production = new Production30_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}