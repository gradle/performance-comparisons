package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_156 {
    private final Production86_156 production = new Production86_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}