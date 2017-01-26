package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_183 {
    private final Production28_183 production = new Production28_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}