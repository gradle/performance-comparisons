package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_456 {
    private final Production44_456 production = new Production44_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}