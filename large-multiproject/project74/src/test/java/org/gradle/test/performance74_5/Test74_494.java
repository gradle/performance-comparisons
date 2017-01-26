package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_494 {
    private final Production74_494 production = new Production74_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}