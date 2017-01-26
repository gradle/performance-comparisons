package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_410 {
    private final Production94_410 production = new Production94_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}