package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_456 {
    private final Production14_456 production = new Production14_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}