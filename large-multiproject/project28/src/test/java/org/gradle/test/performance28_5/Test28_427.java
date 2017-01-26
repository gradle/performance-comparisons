package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_427 {
    private final Production28_427 production = new Production28_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}