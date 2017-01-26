package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_70 {
    private final Production86_70 production = new Production86_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}