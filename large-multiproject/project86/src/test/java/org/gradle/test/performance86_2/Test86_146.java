package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_146 {
    private final Production86_146 production = new Production86_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}