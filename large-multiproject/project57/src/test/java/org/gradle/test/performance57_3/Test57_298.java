package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_298 {
    private final Production57_298 production = new Production57_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}