package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_310 {
    private final Production86_310 production = new Production86_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}