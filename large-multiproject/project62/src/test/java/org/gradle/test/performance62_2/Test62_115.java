package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_115 {
    private final Production62_115 production = new Production62_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}