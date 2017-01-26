package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_239 {
    private final Production75_239 production = new Production75_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}