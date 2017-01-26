package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_185 {
    private final Production57_185 production = new Production57_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}