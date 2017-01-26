package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_402 {
    private final Production57_402 production = new Production57_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}