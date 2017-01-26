package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_265 {
    private final Production94_265 production = new Production94_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}