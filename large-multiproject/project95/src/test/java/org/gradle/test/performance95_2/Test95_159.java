package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_159 {
    private final Production95_159 production = new Production95_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}