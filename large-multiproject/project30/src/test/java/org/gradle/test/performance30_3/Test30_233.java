package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_233 {
    private final Production30_233 production = new Production30_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}