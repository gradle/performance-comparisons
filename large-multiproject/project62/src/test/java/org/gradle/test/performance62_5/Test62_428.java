package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_428 {
    private final Production62_428 production = new Production62_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}