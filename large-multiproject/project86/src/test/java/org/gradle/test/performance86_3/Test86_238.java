package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_238 {
    private final Production86_238 production = new Production86_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}