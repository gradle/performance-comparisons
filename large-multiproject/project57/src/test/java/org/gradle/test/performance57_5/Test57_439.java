package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_439 {
    private final Production57_439 production = new Production57_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}