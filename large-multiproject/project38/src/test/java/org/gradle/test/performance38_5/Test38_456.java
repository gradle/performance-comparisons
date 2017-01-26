package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_456 {
    private final Production38_456 production = new Production38_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}