package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_362 {
    private final Production28_362 production = new Production28_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}