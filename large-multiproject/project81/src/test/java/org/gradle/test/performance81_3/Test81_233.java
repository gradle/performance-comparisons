package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_233 {
    private final Production81_233 production = new Production81_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}