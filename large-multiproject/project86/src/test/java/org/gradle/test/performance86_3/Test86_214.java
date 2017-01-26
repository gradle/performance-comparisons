package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_214 {
    private final Production86_214 production = new Production86_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}