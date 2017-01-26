package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_379 {
    private final Production94_379 production = new Production94_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}