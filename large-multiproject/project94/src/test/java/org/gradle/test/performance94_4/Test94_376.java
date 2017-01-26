package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_376 {
    private final Production94_376 production = new Production94_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}