package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_85 {
    private final Production28_85 production = new Production28_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}