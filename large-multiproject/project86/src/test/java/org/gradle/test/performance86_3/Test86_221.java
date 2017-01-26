package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_221 {
    private final Production86_221 production = new Production86_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}