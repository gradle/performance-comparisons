package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_233 {
    private final Production62_233 production = new Production62_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}