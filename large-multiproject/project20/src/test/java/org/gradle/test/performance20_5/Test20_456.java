package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_456 {
    private final Production20_456 production = new Production20_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}