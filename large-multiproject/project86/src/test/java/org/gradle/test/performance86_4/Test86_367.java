package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_367 {
    private final Production86_367 production = new Production86_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}