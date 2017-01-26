package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_149 {
    private final Production57_149 production = new Production57_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}