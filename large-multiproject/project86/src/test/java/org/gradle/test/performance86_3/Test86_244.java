package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_244 {
    private final Production86_244 production = new Production86_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}