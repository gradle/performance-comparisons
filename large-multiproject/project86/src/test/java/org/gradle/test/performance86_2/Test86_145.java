package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_145 {
    private final Production86_145 production = new Production86_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}