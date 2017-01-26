package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_61 {
    private final Production86_61 production = new Production86_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}