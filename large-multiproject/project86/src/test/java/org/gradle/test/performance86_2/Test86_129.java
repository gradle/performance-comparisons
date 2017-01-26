package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_129 {
    private final Production86_129 production = new Production86_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}