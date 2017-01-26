package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_262 {
    private final Production57_262 production = new Production57_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}