package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_402 {
    private final Production62_402 production = new Production62_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}