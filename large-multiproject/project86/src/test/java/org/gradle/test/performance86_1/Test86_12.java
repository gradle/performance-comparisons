package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_12 {
    private final Production86_12 production = new Production86_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}