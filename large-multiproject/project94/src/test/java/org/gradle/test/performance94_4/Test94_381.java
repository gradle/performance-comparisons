package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_381 {
    private final Production94_381 production = new Production94_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}