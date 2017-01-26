package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_113 {
    private final Production86_113 production = new Production86_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}