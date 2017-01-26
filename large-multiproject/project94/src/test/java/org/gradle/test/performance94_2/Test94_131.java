package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_131 {
    private final Production94_131 production = new Production94_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}