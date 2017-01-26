package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_161 {
    private final Production57_161 production = new Production57_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}