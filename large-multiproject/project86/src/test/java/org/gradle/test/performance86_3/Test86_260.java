package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_260 {
    private final Production86_260 production = new Production86_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}