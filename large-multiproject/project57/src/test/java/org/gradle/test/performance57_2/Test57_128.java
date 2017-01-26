package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_128 {
    private final Production57_128 production = new Production57_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}