package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_13 {
    private final Production57_13 production = new Production57_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}