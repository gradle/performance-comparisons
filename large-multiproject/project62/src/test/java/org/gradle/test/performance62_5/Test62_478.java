package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_478 {
    private final Production62_478 production = new Production62_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}