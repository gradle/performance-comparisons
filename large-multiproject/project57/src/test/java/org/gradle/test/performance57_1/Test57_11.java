package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_11 {
    private final Production57_11 production = new Production57_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}