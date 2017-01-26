package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_316 {
    private final Production57_316 production = new Production57_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}