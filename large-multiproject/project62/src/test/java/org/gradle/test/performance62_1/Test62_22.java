package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_22 {
    private final Production62_22 production = new Production62_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}