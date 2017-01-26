package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_53 {
    private final Production86_53 production = new Production86_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}