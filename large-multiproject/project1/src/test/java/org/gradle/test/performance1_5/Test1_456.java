package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_456 {
    private final Production1_456 production = new Production1_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}