package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_456 {
    private final Production24_456 production = new Production24_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}