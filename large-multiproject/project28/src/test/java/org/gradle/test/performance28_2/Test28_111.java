package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_111 {
    private final Production28_111 production = new Production28_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}