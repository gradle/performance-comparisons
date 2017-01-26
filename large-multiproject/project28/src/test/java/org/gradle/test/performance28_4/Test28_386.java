package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_386 {
    private final Production28_386 production = new Production28_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}