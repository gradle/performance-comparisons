package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_28 {
    private final Production86_28 production = new Production86_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}