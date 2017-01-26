package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_399 {
    private final Production27_399 production = new Production27_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}