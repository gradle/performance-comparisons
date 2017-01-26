package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_49 {
    private final Production28_49 production = new Production28_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}