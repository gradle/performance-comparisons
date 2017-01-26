package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_401 {
    private final Production94_401 production = new Production94_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}