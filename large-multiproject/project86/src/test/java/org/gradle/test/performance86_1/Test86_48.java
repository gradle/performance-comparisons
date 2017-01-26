package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_48 {
    private final Production86_48 production = new Production86_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}