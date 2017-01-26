package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_233 {
    private final Production93_233 production = new Production93_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}