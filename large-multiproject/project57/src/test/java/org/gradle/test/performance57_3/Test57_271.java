package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_271 {
    private final Production57_271 production = new Production57_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}