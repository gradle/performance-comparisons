package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_212 {
    private final Production28_212 production = new Production28_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}