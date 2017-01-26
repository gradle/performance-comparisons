package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_304 {
    private final Production86_304 production = new Production86_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}