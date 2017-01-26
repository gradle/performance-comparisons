package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_166 {
    private final Production86_166 production = new Production86_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}