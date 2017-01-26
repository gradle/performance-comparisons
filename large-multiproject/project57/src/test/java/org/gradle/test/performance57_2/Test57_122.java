package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_122 {
    private final Production57_122 production = new Production57_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}