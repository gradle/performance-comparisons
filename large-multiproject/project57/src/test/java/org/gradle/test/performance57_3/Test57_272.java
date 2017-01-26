package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_272 {
    private final Production57_272 production = new Production57_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}