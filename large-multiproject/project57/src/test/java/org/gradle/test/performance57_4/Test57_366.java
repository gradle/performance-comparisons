package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_366 {
    private final Production57_366 production = new Production57_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}