package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_413 {
    private final Production57_413 production = new Production57_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}