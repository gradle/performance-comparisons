package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_282 {
    private final Production28_282 production = new Production28_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}