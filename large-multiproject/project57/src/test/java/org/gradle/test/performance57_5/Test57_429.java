package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_429 {
    private final Production57_429 production = new Production57_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}