package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_241 {
    private final Production86_241 production = new Production86_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}