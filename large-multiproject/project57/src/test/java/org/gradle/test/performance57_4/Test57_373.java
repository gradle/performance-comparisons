package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_373 {
    private final Production57_373 production = new Production57_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}