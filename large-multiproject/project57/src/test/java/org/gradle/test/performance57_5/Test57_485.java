package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_485 {
    private final Production57_485 production = new Production57_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}