package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_77 {
    private final Production28_77 production = new Production28_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}