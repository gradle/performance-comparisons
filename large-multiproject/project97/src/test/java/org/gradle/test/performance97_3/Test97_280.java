package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_280 {
    private final Production97_280 production = new Production97_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}