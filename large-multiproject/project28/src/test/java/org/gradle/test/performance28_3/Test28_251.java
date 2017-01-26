package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_251 {
    private final Production28_251 production = new Production28_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}