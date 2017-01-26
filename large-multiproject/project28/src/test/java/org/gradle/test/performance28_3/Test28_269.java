package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_269 {
    private final Production28_269 production = new Production28_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}