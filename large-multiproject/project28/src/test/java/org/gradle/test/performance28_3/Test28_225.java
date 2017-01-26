package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_225 {
    private final Production28_225 production = new Production28_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}