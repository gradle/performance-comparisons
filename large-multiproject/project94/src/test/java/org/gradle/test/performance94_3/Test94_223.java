package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_223 {
    private final Production94_223 production = new Production94_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}