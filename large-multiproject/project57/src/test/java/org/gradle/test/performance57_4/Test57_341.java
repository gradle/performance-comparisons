package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_341 {
    private final Production57_341 production = new Production57_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}