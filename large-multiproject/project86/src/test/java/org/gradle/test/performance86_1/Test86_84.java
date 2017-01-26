package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_84 {
    private final Production86_84 production = new Production86_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}