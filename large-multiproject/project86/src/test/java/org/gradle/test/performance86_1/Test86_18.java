package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_18 {
    private final Production86_18 production = new Production86_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}