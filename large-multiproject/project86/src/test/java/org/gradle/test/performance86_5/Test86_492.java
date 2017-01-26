package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_492 {
    private final Production86_492 production = new Production86_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}