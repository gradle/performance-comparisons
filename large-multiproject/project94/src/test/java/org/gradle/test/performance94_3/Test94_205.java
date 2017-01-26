package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_205 {
    private final Production94_205 production = new Production94_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}