package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_272 {
    private final Production4_272 production = new Production4_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}