package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_273 {
    private final Production57_273 production = new Production57_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}