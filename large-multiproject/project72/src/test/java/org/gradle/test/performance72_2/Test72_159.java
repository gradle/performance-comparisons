package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_159 {
    private final Production72_159 production = new Production72_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}