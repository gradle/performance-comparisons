package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_295 {
    private final Production81_295 production = new Production81_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}