package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_264 {
    private final Production57_264 production = new Production57_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}