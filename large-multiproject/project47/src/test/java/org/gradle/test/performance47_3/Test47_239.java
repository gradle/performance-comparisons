package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_239 {
    private final Production47_239 production = new Production47_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}