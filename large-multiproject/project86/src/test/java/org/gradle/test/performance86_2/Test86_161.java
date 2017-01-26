package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_161 {
    private final Production86_161 production = new Production86_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}