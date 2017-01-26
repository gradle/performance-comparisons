package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_403 {
    private final Production94_403 production = new Production94_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}