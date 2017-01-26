package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_275 {
    private final Production81_275 production = new Production81_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}