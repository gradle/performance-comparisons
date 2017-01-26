package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_100 {
    private final Production28_100 production = new Production28_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}