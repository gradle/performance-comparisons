package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_300 {
    private final Production86_300 production = new Production86_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}