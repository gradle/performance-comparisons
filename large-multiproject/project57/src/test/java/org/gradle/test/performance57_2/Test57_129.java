package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_129 {
    private final Production57_129 production = new Production57_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}