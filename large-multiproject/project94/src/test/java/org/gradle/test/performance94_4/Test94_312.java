package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_312 {
    private final Production94_312 production = new Production94_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}