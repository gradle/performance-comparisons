package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_266 {
    private final Production86_266 production = new Production86_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}