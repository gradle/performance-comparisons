package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_107 {
    private final Production28_107 production = new Production28_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}