package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_456 {
    private final Production49_456 production = new Production49_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}