package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_138 {
    private final Production86_138 production = new Production86_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}