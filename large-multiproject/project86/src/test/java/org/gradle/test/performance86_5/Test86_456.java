package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_456 {
    private final Production86_456 production = new Production86_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}