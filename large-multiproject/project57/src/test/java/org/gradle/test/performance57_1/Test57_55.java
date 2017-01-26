package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_55 {
    private final Production57_55 production = new Production57_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}