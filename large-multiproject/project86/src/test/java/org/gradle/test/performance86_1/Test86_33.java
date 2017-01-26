package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_33 {
    private final Production86_33 production = new Production86_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}