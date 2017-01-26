package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_108 {
    private final Production57_108 production = new Production57_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}