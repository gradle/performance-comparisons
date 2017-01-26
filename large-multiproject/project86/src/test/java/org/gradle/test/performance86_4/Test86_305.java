package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_305 {
    private final Production86_305 production = new Production86_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}