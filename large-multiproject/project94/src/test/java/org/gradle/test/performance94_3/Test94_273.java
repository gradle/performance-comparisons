package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_273 {
    private final Production94_273 production = new Production94_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}