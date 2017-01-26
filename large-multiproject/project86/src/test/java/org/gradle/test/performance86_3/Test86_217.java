package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_217 {
    private final Production86_217 production = new Production86_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}