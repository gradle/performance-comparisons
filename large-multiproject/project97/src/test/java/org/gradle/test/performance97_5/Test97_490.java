package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_490 {
    private final Production97_490 production = new Production97_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}