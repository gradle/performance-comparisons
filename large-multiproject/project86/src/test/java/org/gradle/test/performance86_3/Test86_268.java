package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_268 {
    private final Production86_268 production = new Production86_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}