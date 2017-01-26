package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_172 {
    private final Production28_172 production = new Production28_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}