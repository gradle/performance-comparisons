package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_456 {
    private final Production67_456 production = new Production67_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}