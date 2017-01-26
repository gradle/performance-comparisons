package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_349 {
    private final Production57_349 production = new Production57_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}