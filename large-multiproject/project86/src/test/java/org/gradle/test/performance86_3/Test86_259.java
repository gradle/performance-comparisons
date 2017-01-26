package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_259 {
    private final Production86_259 production = new Production86_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}