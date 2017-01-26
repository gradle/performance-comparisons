package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_298 {
    private final Production81_298 production = new Production81_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}