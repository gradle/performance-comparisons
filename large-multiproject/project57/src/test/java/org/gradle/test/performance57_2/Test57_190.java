package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_190 {
    private final Production57_190 production = new Production57_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}