package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_152 {
    private final Production86_152 production = new Production86_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}