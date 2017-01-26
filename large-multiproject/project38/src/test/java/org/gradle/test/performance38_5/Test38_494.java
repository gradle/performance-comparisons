package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_494 {
    private final Production38_494 production = new Production38_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}