package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_7 {
    private final Production86_7 production = new Production86_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}