package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_20 {
    private final Production57_20 production = new Production57_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}