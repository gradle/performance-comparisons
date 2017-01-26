package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_21 {
    private final Production94_21 production = new Production94_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}