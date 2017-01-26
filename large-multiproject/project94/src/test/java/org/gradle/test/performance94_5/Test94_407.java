package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_407 {
    private final Production94_407 production = new Production94_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}