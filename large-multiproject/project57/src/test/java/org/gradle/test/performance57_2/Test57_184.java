package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_184 {
    private final Production57_184 production = new Production57_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}