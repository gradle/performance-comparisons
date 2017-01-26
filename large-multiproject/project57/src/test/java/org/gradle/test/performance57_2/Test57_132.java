package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_132 {
    private final Production57_132 production = new Production57_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}