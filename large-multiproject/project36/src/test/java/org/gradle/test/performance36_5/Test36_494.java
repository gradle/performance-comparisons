package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_494 {
    private final Production36_494 production = new Production36_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}