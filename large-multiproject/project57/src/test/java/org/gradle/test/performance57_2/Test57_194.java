package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_194 {
    private final Production57_194 production = new Production57_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}