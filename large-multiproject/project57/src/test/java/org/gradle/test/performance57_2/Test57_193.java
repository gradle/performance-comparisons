package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_193 {
    private final Production57_193 production = new Production57_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}