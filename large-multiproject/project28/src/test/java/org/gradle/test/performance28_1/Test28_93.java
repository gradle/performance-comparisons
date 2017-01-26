package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_93 {
    private final Production28_93 production = new Production28_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}