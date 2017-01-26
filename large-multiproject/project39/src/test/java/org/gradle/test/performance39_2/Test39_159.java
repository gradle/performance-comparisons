package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_159 {
    private final Production39_159 production = new Production39_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}