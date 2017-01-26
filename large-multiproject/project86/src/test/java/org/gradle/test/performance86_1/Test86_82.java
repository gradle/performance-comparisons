package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_82 {
    private final Production86_82 production = new Production86_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}