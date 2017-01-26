package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_346 {
    private final Production57_346 production = new Production57_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}