package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_389 {
    private final Production81_389 production = new Production81_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}