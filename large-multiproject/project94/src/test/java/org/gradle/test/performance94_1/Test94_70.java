package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_70 {
    private final Production94_70 production = new Production94_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}