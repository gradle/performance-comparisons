package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_389 {
    private final Production62_389 production = new Production62_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}