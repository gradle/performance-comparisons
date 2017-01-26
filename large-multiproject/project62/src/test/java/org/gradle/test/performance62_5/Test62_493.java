package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_493 {
    private final Production62_493 production = new Production62_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}