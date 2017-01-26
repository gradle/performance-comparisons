package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_169 {
    private final Production57_169 production = new Production57_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}