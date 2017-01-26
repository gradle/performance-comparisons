package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_487 {
    private final Production57_487 production = new Production57_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}