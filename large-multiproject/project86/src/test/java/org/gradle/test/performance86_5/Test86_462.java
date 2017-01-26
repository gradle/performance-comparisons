package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_462 {
    private final Production86_462 production = new Production86_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}