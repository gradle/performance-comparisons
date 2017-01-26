package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_447 {
    private final Production57_447 production = new Production57_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}