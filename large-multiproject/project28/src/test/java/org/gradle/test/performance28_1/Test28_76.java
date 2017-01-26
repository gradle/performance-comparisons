package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_76 {
    private final Production28_76 production = new Production28_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}