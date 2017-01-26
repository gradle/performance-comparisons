package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_223 {
    private final Production57_223 production = new Production57_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}