package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_283 {
    private final Production94_283 production = new Production94_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}