package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_245 {
    private final Production81_245 production = new Production81_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}