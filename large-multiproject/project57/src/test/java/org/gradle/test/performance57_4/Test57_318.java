package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_318 {
    private final Production57_318 production = new Production57_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}