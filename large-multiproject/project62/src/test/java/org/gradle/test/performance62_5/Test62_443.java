package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_443 {
    private final Production62_443 production = new Production62_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}