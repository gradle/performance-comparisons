package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_414 {
    private final Production94_414 production = new Production94_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}