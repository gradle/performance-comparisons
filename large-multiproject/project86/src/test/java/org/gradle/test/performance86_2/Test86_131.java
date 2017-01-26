package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_131 {
    private final Production86_131 production = new Production86_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}