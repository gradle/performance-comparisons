package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_142 {
    private final Production86_142 production = new Production86_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}