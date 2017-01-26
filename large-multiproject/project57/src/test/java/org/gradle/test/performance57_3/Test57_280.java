package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_280 {
    private final Production57_280 production = new Production57_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}