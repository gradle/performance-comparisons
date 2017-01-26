package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_320 {
    private final Production86_320 production = new Production86_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}