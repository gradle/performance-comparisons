package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_453 {
    private final Production18_453 production = new Production18_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}