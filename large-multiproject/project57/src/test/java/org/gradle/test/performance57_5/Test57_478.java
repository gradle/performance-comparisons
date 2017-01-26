package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_478 {
    private final Production57_478 production = new Production57_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}