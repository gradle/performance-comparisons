package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_263 {
    private final Production28_263 production = new Production28_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}