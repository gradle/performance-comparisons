package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_456 {
    private final Production9_456 production = new Production9_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}