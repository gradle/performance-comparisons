package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_468 {
    private final Production57_468 production = new Production57_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}