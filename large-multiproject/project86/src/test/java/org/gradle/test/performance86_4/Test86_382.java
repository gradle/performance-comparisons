package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_382 {
    private final Production86_382 production = new Production86_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}