package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_256 {
    private final Production94_256 production = new Production94_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}