package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_213 {
    private final Production57_213 production = new Production57_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}