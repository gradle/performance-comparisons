package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_456 {
    private final Production93_456 production = new Production93_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}