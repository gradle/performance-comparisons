package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_167 {
    private final Production28_167 production = new Production28_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}