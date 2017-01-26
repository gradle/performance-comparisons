package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_197 {
    private final Production57_197 production = new Production57_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}