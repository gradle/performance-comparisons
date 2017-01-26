package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_453 {
    private final Production44_453 production = new Production44_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}