package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_315 {
    private final Production86_315 production = new Production86_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}