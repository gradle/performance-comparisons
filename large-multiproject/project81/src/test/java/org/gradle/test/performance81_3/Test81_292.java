package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_292 {
    private final Production81_292 production = new Production81_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}