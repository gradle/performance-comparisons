package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_258 {
    private final Production94_258 production = new Production94_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}