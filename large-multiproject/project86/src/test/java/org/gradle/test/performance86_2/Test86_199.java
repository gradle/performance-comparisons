package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_199 {
    private final Production86_199 production = new Production86_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}