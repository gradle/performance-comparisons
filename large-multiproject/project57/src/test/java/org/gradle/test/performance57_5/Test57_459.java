package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_459 {
    private final Production57_459 production = new Production57_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}