package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_37 {
    private final Production86_37 production = new Production86_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}