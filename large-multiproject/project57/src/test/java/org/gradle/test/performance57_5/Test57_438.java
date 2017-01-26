package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_438 {
    private final Production57_438 production = new Production57_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}