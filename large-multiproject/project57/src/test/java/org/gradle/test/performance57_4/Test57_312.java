package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_312 {
    private final Production57_312 production = new Production57_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}