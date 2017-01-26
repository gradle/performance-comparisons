package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_87 {
    private final Production86_87 production = new Production86_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}