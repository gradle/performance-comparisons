package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_456 {
    private final Production57_456 production = new Production57_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}