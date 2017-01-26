package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_409 {
    private final Production57_409 production = new Production57_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}