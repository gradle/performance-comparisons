package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_352 {
    private final Production57_352 production = new Production57_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}