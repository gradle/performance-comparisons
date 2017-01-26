package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_22 {
    private final Production57_22 production = new Production57_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}