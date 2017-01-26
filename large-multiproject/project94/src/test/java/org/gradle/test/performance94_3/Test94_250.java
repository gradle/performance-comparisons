package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_250 {
    private final Production94_250 production = new Production94_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}