package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_177 {
    private final Production57_177 production = new Production57_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}