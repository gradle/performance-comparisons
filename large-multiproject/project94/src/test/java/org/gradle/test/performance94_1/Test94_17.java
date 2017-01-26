package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_17 {
    private final Production94_17 production = new Production94_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}