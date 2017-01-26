package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_232 {
    private final Production94_232 production = new Production94_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}