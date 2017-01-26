package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_389 {
    private final Production27_389 production = new Production27_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}