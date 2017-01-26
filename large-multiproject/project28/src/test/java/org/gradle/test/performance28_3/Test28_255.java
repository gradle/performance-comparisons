package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_255 {
    private final Production28_255 production = new Production28_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}