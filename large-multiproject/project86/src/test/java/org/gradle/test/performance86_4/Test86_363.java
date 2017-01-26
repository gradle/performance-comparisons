package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_363 {
    private final Production86_363 production = new Production86_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}