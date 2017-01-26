package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_135 {
    private final Production86_135 production = new Production86_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}