package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_238 {
    private final Production94_238 production = new Production94_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}