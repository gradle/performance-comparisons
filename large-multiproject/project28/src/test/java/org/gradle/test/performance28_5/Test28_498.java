package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_498 {
    private final Production28_498 production = new Production28_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}