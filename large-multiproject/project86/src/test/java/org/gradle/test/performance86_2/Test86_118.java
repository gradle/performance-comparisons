package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_118 {
    private final Production86_118 production = new Production86_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}