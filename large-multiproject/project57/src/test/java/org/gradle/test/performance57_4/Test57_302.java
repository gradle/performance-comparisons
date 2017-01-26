package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_302 {
    private final Production57_302 production = new Production57_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}