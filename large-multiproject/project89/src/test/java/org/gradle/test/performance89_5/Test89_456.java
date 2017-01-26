package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_456 {
    private final Production89_456 production = new Production89_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}