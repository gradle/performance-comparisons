package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_52 {
    private final Production94_52 production = new Production94_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}