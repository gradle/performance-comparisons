package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_442 {
    private final Production86_442 production = new Production86_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}