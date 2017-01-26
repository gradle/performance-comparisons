package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_419 {
    private final Production86_419 production = new Production86_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}