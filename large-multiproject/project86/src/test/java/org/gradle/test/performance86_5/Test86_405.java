package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_405 {
    private final Production86_405 production = new Production86_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}