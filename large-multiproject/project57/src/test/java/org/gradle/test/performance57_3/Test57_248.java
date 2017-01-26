package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_248 {
    private final Production57_248 production = new Production57_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}