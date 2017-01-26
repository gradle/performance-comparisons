package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_446 {
    private final Production86_446 production = new Production86_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}