package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_55 {
    private final Production86_55 production = new Production86_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}