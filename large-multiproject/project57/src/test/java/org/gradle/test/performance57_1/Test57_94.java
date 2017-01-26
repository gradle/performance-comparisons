package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_94 {
    private final Production57_94 production = new Production57_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}