package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_162 {
    private final Production86_162 production = new Production86_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}