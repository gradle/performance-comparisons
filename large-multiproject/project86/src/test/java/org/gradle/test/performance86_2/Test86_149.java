package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_149 {
    private final Production86_149 production = new Production86_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}