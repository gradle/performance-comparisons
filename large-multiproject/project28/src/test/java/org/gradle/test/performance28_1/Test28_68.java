package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_68 {
    private final Production28_68 production = new Production28_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}