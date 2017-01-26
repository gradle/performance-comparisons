package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_470 {
    private final Production57_470 production = new Production57_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}