package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_345 {
    private final Production86_345 production = new Production86_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}