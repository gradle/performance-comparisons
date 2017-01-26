package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_108 {
    private final Production94_108 production = new Production94_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}