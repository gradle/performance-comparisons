package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_351 {
    private final Production57_351 production = new Production57_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}