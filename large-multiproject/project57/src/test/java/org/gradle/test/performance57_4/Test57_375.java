package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_375 {
    private final Production57_375 production = new Production57_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}