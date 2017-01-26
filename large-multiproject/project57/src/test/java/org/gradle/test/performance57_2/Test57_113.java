package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_113 {
    private final Production57_113 production = new Production57_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}