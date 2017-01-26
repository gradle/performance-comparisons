package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_400 {
    private final Production57_400 production = new Production57_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}