package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_81 {
    private final Production86_81 production = new Production86_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}