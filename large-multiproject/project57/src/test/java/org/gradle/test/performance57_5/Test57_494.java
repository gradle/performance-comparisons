package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_494 {
    private final Production57_494 production = new Production57_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}