package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_346 {
    private final Production62_346 production = new Production62_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}