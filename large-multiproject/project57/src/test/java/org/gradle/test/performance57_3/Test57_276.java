package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_276 {
    private final Production57_276 production = new Production57_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}