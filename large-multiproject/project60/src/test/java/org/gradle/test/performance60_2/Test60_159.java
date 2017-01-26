package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_159 {
    private final Production60_159 production = new Production60_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}