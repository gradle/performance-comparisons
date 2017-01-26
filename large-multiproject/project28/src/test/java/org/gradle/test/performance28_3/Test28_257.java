package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_257 {
    private final Production28_257 production = new Production28_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}