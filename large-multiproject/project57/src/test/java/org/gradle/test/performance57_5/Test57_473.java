package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_473 {
    private final Production57_473 production = new Production57_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}