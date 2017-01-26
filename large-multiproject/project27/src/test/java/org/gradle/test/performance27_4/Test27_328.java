package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_328 {
    private final Production27_328 production = new Production27_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}