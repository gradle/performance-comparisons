package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_41 {
    private final Production28_41 production = new Production28_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}