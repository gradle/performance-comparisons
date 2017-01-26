package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_116 {
    private final Production57_116 production = new Production57_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}