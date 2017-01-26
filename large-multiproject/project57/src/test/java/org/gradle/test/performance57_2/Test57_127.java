package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_127 {
    private final Production57_127 production = new Production57_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}