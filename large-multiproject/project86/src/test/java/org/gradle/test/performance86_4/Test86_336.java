package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_336 {
    private final Production86_336 production = new Production86_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}