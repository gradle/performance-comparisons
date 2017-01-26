package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_285 {
    private final Production81_285 production = new Production81_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}