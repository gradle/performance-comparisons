package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_262 {
    private final Production81_262 production = new Production81_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}