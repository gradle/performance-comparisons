package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_483 {
    private final Production57_483 production = new Production57_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}