package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_357 {
    private final Production86_357 production = new Production86_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}