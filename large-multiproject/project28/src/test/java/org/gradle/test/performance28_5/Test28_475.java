package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_475 {
    private final Production28_475 production = new Production28_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}