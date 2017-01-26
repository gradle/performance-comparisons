package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_399 {
    private final Production97_399 production = new Production97_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}