package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_397 {
    private final Production57_397 production = new Production57_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}