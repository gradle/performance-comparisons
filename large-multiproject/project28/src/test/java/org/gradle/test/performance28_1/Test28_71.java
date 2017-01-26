package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_71 {
    private final Production28_71 production = new Production28_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}