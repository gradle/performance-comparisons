package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_104 {
    private final Production86_104 production = new Production86_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}