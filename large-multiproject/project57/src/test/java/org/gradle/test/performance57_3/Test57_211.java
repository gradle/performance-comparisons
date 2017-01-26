package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_211 {
    private final Production57_211 production = new Production57_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}