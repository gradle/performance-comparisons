package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_288 {
    private final Production28_288 production = new Production28_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}