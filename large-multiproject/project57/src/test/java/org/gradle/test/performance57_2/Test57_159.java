package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_159 {
    private final Production57_159 production = new Production57_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}