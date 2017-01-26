package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_389 {
    private final Production57_389 production = new Production57_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}