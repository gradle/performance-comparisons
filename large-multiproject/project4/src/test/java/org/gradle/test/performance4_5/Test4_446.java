package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_446 {
    private final Production4_446 production = new Production4_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}