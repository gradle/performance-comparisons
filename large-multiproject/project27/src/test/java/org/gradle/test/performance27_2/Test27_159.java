package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_159 {
    private final Production27_159 production = new Production27_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}