package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_52 {
    private final Production62_52 production = new Production62_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}