package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_180 {
    private final Production57_180 production = new Production57_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}