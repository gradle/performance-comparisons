package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_33 {
    private final Production94_33 production = new Production94_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}