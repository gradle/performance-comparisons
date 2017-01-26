package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_446 {
    private final Production62_446 production = new Production62_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}