package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_153 {
    private final Production57_153 production = new Production57_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}