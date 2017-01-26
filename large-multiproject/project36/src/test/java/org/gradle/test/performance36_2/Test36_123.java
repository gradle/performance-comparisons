package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_123 {
    private final Production36_123 production = new Production36_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}