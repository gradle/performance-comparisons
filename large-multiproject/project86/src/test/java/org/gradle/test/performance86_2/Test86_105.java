package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_105 {
    private final Production86_105 production = new Production86_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}