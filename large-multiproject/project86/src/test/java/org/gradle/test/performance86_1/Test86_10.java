package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_10 {
    private final Production86_10 production = new Production86_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}