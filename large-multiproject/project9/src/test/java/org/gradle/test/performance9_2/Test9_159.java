package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_159 {
    private final Production9_159 production = new Production9_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}