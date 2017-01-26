package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_117 {
    private final Production57_117 production = new Production57_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}