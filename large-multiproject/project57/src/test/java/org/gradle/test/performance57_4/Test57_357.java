package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_357 {
    private final Production57_357 production = new Production57_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}