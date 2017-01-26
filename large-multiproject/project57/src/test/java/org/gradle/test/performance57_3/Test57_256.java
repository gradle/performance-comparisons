package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_256 {
    private final Production57_256 production = new Production57_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}