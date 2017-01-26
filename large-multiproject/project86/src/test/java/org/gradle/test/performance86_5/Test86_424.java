package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_424 {
    private final Production86_424 production = new Production86_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}