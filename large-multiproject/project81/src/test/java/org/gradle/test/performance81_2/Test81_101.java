package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_101 {
    private final Production81_101 production = new Production81_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}