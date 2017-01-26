package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_456 {
    private final Production43_456 production = new Production43_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}