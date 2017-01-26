package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_143 {
    private final Production86_143 production = new Production86_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}