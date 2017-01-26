package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_448 {
    private final Production57_448 production = new Production57_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}