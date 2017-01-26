package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_201 {
    private final Production57_201 production = new Production57_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}