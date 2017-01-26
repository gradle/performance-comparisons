package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_132 {
    private final Production94_132 production = new Production94_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}