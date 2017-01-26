package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_239 {
    private final Production4_239 production = new Production4_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}