package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_86 {
    private final Production57_86 production = new Production57_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}