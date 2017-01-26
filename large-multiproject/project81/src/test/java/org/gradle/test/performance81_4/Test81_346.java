package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_346 {
    private final Production81_346 production = new Production81_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}