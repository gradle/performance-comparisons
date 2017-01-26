package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_456 {
    private final Production74_456 production = new Production74_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}