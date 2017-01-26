package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_115 {
    private final Production15_115 production = new Production15_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}