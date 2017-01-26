package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_407 {
    private final Production62_407 production = new Production62_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}