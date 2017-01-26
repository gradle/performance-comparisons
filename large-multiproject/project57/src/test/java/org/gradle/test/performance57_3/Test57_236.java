package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_236 {
    private final Production57_236 production = new Production57_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}