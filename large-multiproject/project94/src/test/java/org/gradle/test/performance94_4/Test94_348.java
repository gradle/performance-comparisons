package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_348 {
    private final Production94_348 production = new Production94_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}