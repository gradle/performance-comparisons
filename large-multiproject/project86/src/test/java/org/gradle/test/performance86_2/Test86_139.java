package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_139 {
    private final Production86_139 production = new Production86_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}