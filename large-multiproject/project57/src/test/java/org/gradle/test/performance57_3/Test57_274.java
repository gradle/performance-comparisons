package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_274 {
    private final Production57_274 production = new Production57_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}