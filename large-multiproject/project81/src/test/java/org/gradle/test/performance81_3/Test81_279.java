package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_279 {
    private final Production81_279 production = new Production81_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}