package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_30 {
    private final Production94_30 production = new Production94_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}