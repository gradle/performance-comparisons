package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_15 {
    private final Production57_15 production = new Production57_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}