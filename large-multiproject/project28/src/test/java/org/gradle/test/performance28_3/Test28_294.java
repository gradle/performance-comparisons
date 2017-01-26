package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_294 {
    private final Production28_294 production = new Production28_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}