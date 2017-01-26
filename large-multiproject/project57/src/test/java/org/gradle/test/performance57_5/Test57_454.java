package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_454 {
    private final Production57_454 production = new Production57_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}