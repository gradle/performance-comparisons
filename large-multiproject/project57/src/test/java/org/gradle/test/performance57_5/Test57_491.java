package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_491 {
    private final Production57_491 production = new Production57_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}