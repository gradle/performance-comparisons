package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_115 {
    private final Production27_115 production = new Production27_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}