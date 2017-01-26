package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_448 {
    private final Production62_448 production = new Production62_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}