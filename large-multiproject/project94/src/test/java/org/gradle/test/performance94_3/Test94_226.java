package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_226 {
    private final Production94_226 production = new Production94_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}