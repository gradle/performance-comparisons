package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_166 {
    private final Production28_166 production = new Production28_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}