package org.gradle.test.performance28_4;

import static org.junit.Assert.*;

public class Test28_331 {
    private final Production28_331 production = new Production28_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}