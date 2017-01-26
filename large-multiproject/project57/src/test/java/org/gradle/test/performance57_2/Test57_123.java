package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_123 {
    private final Production57_123 production = new Production57_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}