package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_399 {
    private final Production94_399 production = new Production94_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}