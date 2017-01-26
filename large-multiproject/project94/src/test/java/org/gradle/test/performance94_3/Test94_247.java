package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_247 {
    private final Production94_247 production = new Production94_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}