package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_34 {
    private final Production86_34 production = new Production86_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}