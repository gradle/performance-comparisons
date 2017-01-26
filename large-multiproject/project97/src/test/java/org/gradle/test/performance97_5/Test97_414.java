package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_414 {
    private final Production97_414 production = new Production97_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}