package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_42 {
    private final Production86_42 production = new Production86_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}