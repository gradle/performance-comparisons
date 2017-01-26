package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_30 {
    private final Production86_30 production = new Production86_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}