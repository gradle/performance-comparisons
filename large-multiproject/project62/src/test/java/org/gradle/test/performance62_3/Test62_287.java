package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_287 {
    private final Production62_287 production = new Production62_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}