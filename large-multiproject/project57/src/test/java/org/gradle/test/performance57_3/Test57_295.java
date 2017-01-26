package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_295 {
    private final Production57_295 production = new Production57_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}