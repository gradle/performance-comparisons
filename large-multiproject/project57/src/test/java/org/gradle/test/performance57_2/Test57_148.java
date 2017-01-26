package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_148 {
    private final Production57_148 production = new Production57_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}