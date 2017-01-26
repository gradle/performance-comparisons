package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_159 {
    private final Production24_159 production = new Production24_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}