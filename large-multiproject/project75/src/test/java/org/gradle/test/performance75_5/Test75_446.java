package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_446 {
    private final Production75_446 production = new Production75_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}