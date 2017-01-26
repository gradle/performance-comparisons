package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_291 {
    private final Production57_291 production = new Production57_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}