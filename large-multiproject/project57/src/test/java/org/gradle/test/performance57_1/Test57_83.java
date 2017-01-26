package org.gradle.test.performance57_1;

import static org.junit.Assert.*;

public class Test57_83 {
    private final Production57_83 production = new Production57_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}