package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_9 {
    private final Production28_9 production = new Production28_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}