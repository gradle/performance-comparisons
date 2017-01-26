package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_15 {
    private final Production86_15 production = new Production86_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}