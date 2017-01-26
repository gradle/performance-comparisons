package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_158 {
    private final Production57_158 production = new Production57_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}