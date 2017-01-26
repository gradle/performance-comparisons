package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_332 {
    private final Production57_332 production = new Production57_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}