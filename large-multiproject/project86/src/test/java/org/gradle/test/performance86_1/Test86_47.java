package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_47 {
    private final Production86_47 production = new Production86_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}