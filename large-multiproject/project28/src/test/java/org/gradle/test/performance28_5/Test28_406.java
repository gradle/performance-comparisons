package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_406 {
    private final Production28_406 production = new Production28_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}