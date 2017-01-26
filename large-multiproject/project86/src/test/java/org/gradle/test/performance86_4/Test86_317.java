package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_317 {
    private final Production86_317 production = new Production86_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}