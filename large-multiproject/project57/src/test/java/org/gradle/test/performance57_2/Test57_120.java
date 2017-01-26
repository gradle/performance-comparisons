package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_120 {
    private final Production57_120 production = new Production57_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}