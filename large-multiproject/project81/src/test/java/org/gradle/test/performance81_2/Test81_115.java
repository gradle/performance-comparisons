package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_115 {
    private final Production81_115 production = new Production81_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}