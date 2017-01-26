package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_176 {
    private final Production57_176 production = new Production57_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}