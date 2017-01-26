package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_263 {
    private final Production86_263 production = new Production86_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}