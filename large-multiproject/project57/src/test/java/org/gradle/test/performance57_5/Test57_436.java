package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_436 {
    private final Production57_436 production = new Production57_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}