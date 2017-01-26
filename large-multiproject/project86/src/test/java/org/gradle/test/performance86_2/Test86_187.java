package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_187 {
    private final Production86_187 production = new Production86_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}