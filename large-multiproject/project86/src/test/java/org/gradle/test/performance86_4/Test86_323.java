package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_323 {
    private final Production86_323 production = new Production86_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}