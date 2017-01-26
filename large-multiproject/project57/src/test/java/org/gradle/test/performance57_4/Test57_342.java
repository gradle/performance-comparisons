package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_342 {
    private final Production57_342 production = new Production57_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}