package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_210 {
    private final Production86_210 production = new Production86_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}