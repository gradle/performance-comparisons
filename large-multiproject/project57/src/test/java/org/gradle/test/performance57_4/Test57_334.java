package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_334 {
    private final Production57_334 production = new Production57_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}