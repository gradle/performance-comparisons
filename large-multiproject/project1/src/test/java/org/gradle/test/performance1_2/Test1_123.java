package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_123 {
    private final Production1_123 production = new Production1_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}