package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_290 {
    private final Production86_290 production = new Production86_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}