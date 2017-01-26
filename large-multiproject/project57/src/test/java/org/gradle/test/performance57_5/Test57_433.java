package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_433 {
    private final Production57_433 production = new Production57_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}