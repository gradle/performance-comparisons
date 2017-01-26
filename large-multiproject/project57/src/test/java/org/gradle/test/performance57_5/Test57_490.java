package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_490 {
    private final Production57_490 production = new Production57_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}