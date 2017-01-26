package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_95 {
    private final Production86_95 production = new Production86_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}