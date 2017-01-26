package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_44 {
    private final Production28_44 production = new Production28_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}