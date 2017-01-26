package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_371 {
    private final Production86_371 production = new Production86_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}