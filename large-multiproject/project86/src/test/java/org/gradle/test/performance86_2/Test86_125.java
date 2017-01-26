package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_125 {
    private final Production86_125 production = new Production86_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}