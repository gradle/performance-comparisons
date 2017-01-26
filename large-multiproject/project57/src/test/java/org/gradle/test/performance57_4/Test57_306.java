package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_306 {
    private final Production57_306 production = new Production57_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}