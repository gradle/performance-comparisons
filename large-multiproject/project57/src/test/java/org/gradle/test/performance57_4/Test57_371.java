package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_371 {
    private final Production57_371 production = new Production57_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}