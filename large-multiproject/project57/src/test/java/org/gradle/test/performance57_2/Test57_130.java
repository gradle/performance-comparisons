package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_130 {
    private final Production57_130 production = new Production57_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}