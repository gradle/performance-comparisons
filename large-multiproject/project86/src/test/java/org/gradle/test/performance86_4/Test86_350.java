package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_350 {
    private final Production86_350 production = new Production86_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}