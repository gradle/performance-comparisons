package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_251 {
    private final Production86_251 production = new Production86_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}