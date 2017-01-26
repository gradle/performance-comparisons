package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_13 {
    private final Production94_13 production = new Production94_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}