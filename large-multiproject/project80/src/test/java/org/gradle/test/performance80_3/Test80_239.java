package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_239 {
    private final Production80_239 production = new Production80_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}