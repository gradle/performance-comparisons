package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_43 {
    private final Production28_43 production = new Production28_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}