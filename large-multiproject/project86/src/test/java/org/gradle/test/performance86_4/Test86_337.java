package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_337 {
    private final Production86_337 production = new Production86_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}