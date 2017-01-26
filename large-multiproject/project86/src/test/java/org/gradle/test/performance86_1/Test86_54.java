package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_54 {
    private final Production86_54 production = new Production86_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}