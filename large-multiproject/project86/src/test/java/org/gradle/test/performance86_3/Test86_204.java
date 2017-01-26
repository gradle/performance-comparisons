package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_204 {
    private final Production86_204 production = new Production86_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}