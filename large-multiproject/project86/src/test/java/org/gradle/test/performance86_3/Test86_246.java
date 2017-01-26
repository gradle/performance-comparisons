package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_246 {
    private final Production86_246 production = new Production86_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}