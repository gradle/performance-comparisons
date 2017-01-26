package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_464 {
    private final Production86_464 production = new Production86_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}