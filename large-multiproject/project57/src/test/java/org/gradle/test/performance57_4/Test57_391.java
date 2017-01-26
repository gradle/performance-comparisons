package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_391 {
    private final Production57_391 production = new Production57_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}