package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_483 {
    private final Production62_483 production = new Production62_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}