package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_21 {
    private final Production62_21 production = new Production62_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}