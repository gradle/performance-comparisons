package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_273 {
    private final Production62_273 production = new Production62_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}