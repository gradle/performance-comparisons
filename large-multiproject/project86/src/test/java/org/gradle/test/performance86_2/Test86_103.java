package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_103 {
    private final Production86_103 production = new Production86_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}