package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_313 {
    private final Production86_313 production = new Production86_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}