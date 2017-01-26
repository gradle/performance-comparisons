package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_121 {
    private final Production57_121 production = new Production57_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}