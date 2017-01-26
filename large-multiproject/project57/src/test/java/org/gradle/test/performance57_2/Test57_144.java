package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_144 {
    private final Production57_144 production = new Production57_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}