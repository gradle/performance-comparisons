package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_399 {
    private final Production15_399 production = new Production15_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}