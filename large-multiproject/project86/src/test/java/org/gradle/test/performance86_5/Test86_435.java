package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_435 {
    private final Production86_435 production = new Production86_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}