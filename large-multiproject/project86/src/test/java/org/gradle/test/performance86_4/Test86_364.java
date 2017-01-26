package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_364 {
    private final Production86_364 production = new Production86_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}