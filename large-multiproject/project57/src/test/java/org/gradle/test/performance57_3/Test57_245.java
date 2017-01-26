package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_245 {
    private final Production57_245 production = new Production57_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}