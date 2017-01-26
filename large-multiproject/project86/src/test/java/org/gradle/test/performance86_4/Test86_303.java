package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_303 {
    private final Production86_303 production = new Production86_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}