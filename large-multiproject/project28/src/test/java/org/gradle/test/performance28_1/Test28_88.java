package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_88 {
    private final Production28_88 production = new Production28_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}