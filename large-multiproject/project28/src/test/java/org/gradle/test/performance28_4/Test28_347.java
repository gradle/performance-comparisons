package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_347 {
    private final Production28_347 production = new Production28_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}