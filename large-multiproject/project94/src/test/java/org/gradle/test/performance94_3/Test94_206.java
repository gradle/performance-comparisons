package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_206 {
    private final Production94_206 production = new Production94_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}