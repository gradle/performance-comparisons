package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_399 {
    private final Production62_399 production = new Production62_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}