package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_56 {
    private final Production57_56 production = new Production57_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}