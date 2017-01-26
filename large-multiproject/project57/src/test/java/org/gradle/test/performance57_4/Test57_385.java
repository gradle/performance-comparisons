package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_385 {
    private final Production57_385 production = new Production57_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}