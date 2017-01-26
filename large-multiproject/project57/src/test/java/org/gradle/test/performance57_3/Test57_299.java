package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_299 {
    private final Production57_299 production = new Production57_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}