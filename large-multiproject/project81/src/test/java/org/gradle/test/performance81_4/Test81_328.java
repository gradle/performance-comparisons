package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_328 {
    private final Production81_328 production = new Production81_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}