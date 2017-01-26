package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_368 {
    private final Production57_368 production = new Production57_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}