package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_160 {
    private final Production57_160 production = new Production57_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}