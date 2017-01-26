package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_105 {
    private final Production57_105 production = new Production57_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}