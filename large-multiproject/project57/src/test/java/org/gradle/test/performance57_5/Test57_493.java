package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_493 {
    private final Production57_493 production = new Production57_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}