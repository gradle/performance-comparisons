package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_122 {
    private final Production86_122 production = new Production86_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}