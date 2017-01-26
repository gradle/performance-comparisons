package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_476 {
    private final Production86_476 production = new Production86_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}