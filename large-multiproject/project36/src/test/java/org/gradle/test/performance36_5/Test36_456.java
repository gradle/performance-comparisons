package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_456 {
    private final Production36_456 production = new Production36_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}