package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_27 {
    private final Production28_27 production = new Production28_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}