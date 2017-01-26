package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_233 {
    private final Production4_233 production = new Production4_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}