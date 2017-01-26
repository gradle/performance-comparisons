package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_114 {
    private final Production86_114 production = new Production86_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}