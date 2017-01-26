package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_295 {
    private final Production62_295 production = new Production62_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}