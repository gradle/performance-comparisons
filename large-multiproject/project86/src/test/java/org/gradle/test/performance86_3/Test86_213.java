package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_213 {
    private final Production86_213 production = new Production86_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}