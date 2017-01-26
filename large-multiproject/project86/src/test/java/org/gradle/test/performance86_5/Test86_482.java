package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_482 {
    private final Production86_482 production = new Production86_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}