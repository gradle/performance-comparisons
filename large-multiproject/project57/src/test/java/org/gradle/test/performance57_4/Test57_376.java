package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_376 {
    private final Production57_376 production = new Production57_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}