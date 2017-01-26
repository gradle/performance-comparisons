package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_239 {
    private final Production86_239 production = new Production86_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}