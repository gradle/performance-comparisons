package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_83 {
    private final Production94_83 production = new Production94_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}