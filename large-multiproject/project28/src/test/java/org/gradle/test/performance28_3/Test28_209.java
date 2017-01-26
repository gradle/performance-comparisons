package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_209 {
    private final Production28_209 production = new Production28_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}