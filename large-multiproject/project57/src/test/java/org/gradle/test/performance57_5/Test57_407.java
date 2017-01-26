package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_407 {
    private final Production57_407 production = new Production57_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}