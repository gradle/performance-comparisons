package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_311 {
    private final Production86_311 production = new Production86_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}