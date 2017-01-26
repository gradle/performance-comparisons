package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_16 {
    private final Production86_16 production = new Production86_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}