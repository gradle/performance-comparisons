package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_450 {
    private final Production86_450 production = new Production86_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}