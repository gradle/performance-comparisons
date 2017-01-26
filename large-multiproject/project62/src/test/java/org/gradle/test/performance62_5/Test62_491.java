package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_491 {
    private final Production62_491 production = new Production62_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}