package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_339 {
    private final Production57_339 production = new Production57_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}