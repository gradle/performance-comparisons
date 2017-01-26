package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_26 {
    private final Production86_26 production = new Production86_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}