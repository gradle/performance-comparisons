package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_280 {
    private final Production81_280 production = new Production81_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}