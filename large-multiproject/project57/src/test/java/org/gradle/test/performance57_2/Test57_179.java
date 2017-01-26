package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_179 {
    private final Production57_179 production = new Production57_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}