package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_245 {
    private final Production9_245 production = new Production9_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}