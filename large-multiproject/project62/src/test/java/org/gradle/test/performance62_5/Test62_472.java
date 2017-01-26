package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_472 {
    private final Production62_472 production = new Production62_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}