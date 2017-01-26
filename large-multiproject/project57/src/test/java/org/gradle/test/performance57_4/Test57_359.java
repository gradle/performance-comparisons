package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_359 {
    private final Production57_359 production = new Production57_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}