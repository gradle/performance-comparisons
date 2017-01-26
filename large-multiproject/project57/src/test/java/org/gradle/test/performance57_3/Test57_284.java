package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_284 {
    private final Production57_284 production = new Production57_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}