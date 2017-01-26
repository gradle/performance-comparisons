package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_451 {
    private final Production57_451 production = new Production57_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}