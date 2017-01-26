package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_117 {
    private final Production81_117 production = new Production81_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}