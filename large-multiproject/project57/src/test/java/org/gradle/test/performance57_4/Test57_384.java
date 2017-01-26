package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_384 {
    private final Production57_384 production = new Production57_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}