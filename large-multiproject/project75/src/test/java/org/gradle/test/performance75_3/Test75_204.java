package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_204 {
    private final Production75_204 production = new Production75_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}