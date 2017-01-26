package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_4 {
    private final Production86_4 production = new Production86_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}