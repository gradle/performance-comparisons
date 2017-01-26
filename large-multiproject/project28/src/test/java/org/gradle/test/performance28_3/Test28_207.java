package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_207 {
    private final Production28_207 production = new Production28_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}