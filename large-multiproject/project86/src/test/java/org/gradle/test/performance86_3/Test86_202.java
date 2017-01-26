package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_202 {
    private final Production86_202 production = new Production86_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}