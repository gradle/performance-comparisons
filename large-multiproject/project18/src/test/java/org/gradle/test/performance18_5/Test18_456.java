package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_456 {
    private final Production18_456 production = new Production18_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}