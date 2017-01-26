package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_50 {
    private final Production57_50 production = new Production57_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}