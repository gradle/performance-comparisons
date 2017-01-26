package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_494 {
    private final Production46_494 production = new Production46_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}