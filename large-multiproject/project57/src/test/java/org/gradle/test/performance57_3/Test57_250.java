package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_250 {
    private final Production57_250 production = new Production57_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}