package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_156 {
    private final Production57_156 production = new Production57_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}