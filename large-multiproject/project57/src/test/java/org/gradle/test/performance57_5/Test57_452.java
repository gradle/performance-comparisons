package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_452 {
    private final Production57_452 production = new Production57_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}