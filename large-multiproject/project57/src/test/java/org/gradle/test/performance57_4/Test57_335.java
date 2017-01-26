package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_335 {
    private final Production57_335 production = new Production57_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}