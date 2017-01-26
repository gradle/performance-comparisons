package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_327 {
    private final Production57_327 production = new Production57_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}