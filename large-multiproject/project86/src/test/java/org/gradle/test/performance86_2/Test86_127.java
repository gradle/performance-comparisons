package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_127 {
    private final Production86_127 production = new Production86_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}