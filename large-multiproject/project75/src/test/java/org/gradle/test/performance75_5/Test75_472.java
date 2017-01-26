package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_472 {
    private final Production75_472 production = new Production75_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}