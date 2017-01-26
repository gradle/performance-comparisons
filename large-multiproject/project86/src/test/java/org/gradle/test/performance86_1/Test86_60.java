package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_60 {
    private final Production86_60 production = new Production86_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}