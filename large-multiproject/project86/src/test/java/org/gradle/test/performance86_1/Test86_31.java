package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_31 {
    private final Production86_31 production = new Production86_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}