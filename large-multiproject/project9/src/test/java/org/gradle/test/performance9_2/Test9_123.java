package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_123 {
    private final Production9_123 production = new Production9_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}