package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_133 {
    private final Production86_133 production = new Production86_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}