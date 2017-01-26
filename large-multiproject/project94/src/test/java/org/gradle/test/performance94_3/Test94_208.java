package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_208 {
    private final Production94_208 production = new Production94_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}