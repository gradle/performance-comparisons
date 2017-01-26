package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_354 {
    private final Production57_354 production = new Production57_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}