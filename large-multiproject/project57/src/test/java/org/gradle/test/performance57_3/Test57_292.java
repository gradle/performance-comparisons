package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_292 {
    private final Production57_292 production = new Production57_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}