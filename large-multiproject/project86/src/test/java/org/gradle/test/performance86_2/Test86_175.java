package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_175 {
    private final Production86_175 production = new Production86_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}