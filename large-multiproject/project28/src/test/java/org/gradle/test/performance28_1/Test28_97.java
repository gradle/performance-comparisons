package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_97 {
    private final Production28_97 production = new Production28_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}