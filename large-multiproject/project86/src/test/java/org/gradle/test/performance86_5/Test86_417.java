package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_417 {
    private final Production86_417 production = new Production86_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}