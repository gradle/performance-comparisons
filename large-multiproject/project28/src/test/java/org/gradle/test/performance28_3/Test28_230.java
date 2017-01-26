package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_230 {
    private final Production28_230 production = new Production28_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}