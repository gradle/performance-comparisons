package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_25 {
    private final Production86_25 production = new Production86_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}