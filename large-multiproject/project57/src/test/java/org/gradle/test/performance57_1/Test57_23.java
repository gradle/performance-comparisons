package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_23 {
    private final Production57_23 production = new Production57_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}