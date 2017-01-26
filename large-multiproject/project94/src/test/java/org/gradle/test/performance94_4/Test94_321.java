package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_321 {
    private final Production94_321 production = new Production94_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}