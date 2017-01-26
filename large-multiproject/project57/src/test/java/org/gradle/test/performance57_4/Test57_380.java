package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_380 {
    private final Production57_380 production = new Production57_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}