package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_430 {
    private final Production57_430 production = new Production57_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}