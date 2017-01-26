package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_117 {
    private final Production9_117 production = new Production9_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}