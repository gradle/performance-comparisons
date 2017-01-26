package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_471 {
    private final Production86_471 production = new Production86_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}