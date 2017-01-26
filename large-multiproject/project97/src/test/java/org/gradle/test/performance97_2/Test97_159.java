package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_159 {
    private final Production97_159 production = new Production97_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}