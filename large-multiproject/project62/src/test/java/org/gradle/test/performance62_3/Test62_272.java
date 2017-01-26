package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_272 {
    private final Production62_272 production = new Production62_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}