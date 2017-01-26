package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_110 {
    private final Production57_110 production = new Production57_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}