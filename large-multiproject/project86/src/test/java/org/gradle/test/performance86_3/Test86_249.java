package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_249 {
    private final Production86_249 production = new Production86_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}