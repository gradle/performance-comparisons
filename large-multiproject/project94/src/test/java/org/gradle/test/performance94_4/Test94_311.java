package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_311 {
    private final Production94_311 production = new Production94_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}