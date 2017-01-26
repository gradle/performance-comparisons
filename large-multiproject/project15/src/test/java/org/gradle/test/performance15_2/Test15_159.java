package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_159 {
    private final Production15_159 production = new Production15_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}