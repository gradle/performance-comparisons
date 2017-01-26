package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_491 {
    private final Production81_491 production = new Production81_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}