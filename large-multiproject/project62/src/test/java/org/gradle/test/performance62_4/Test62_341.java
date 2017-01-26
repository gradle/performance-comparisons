package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_341 {
    private final Production62_341 production = new Production62_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}