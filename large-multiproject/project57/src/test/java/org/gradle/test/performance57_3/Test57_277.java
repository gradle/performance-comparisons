package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_277 {
    private final Production57_277 production = new Production57_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}