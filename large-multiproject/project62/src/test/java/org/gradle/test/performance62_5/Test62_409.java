package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_409 {
    private final Production62_409 production = new Production62_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}