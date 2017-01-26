package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_453 {
    private final Production97_453 production = new Production97_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}