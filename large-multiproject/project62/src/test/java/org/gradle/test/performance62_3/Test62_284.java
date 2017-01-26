package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_284 {
    private final Production62_284 production = new Production62_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}