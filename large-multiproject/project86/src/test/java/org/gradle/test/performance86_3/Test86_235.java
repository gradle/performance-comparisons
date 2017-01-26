package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_235 {
    private final Production86_235 production = new Production86_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}