package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_446 {
    private final Production47_446 production = new Production47_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}