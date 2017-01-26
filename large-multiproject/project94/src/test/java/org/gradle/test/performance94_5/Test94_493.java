package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_493 {
    private final Production94_493 production = new Production94_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}