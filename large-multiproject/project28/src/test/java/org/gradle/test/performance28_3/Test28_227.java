package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_227 {
    private final Production28_227 production = new Production28_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}