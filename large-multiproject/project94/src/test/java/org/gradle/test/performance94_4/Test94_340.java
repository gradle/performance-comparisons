package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_340 {
    private final Production94_340 production = new Production94_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}