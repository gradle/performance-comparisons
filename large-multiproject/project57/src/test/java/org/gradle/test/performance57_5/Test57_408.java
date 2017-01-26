package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_408 {
    private final Production57_408 production = new Production57_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}