package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_445 {
    private final Production28_445 production = new Production28_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}