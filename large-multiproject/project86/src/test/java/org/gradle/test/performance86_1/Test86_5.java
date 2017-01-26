package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_5 {
    private final Production86_5 production = new Production86_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}