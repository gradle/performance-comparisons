package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_45 {
    private final Production28_45 production = new Production28_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}